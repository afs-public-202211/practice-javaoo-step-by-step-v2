package ooss;

public class Student extends Person {

    public Student(int id, String name, int age ){
        super(id,name,age);
    }

    @Override
    public String introduce() {

        return String.format("My name is %s. I am %d years old. I am a student.", super.getName(), super.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return super.getId() == student.getId();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + super.getId();
        return result;
    }
}
