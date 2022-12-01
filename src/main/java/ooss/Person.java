package ooss;

public class Person {
    private final String name;
    private final int id;
    private final int age;

    public Person(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.",name,age);
    }

    public int getId(){ return id;}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void printAttachedMsg(String identityName,Klass kclass) {
        System.out.println(String.format(
                "I am %s, %s of Class %d. I know %s become Leader.",
                this.name,
                identityName,
                kclass.hashCode(),
                kclass.getLeader().getName()));
    }

}
