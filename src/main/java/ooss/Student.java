package ooss;

import java.text.MessageFormat;

public class Student extends Person{

    private Klass klass;
    private int klassLeaderNum;

    public Student(int id, String name, int age) {
        super(id, name, age);
        klass = new Klass(0);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    public int getKlassLeaderNum() {
        return klassLeaderNum;
    }

    public void setKlassLeaderNum(int classNumberLeader) {
        this.klassLeaderNum = classNumberLeader;
    }

    public void join(Klass klass) {
        this.klass.setNumber(klass.getNumber());
    }

    public boolean isIn(Klass klass) {
        return this.klass.getNumber() == klass.getNumber();
    }

    public String introduce(){
        if (this.klass.getNumber() == 0){
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a student."
                    , getName(), getAge());}
        else if(this.klass.getNumber() == this.klassLeaderNum){
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a student. I am the leader of class {2}."
                    , getName(), getAge(), this.klass.getNumber());
        }else{
            return MessageFormat.format("My name is {0}. I am {1} years old. I am a student. I am in class {2}."
                    , getName(), getAge(), this.klass.getNumber());
        }
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