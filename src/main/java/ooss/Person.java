package ooss;

import java.text.MessageFormat;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
        //return String.format("My name is %s. I am %s years old.", name, age);
        //return "My name is " + name + ". I am " + age + "years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Person)) return false;

        Person person = (Person) obj;

        return person.id == id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
