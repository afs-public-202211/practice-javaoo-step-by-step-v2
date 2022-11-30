package ooss;

import java.text.MessageFormat;

public class Student extends Person{


    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce(){
        return MessageFormat.format("My name is {0}. I am {1} years old. I am a student.", getName(), getAge());
        //return String.format("My name is %s. I am %s years old.", name, age);
        //return "My name is " + name + ". I am " + age + "years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Student)) return false;

        Student student = (Student) obj;

        return student.getId() == getId();
    }
}
