package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public class Teacher extends Person{

    private List<Klass> teachingClasses;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.teachingClasses = new ArrayList<Klass>();;
    }

    public Teacher(int id, String name, int age, List<Klass> teachingClasses) {
        super(id, name, age);
        this.teachingClasses = teachingClasses;
    }

    public List<Klass> getTeachingClasses() {
        return this.teachingClasses;
    }

    public void assignTo(Klass klass){
        this.teachingClasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        if (teachingClasses != null){
        return this.teachingClasses.stream().anyMatch( oneClass -> oneClass.getNumber() == klass.getNumber());}
        else{return false;}
    }

    public boolean isTeaching(Student student){
        if (teachingClasses != null){
            return this.teachingClasses.stream().anyMatch( oneClass -> oneClass.getNumber() == student.getKlass().getNumber());}
        else{return false;}
    }
    public String introduce(){

        if (teachingClasses.size() == 0){
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a teacher.", getName(), getAge());}
        else{
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a teacher. I teach Class {2}."
                    ,getName(), getAge()
                    ,this.teachingClasses.stream()
                            .map(oneClass -> Integer.toString(oneClass.getNumber()))
                            .collect(Collectors.joining(", ")));
        }
        //return String.format("My name is %s. I am %s years old.", name, age);
        //return "My name is " + name + ". I am " + age + "years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Teacher)) return false;

        Teacher teacher = (Teacher) obj;

        return teacher.getId() == getId();
    }
}
