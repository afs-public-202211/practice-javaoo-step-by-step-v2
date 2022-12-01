package ooss;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Klass {
    private int id;
    private Student leader;
    private Student attachedStudent;
    private Teacher attachedTeacher;

    public Klass(int id){
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return id == klass.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public void assignLeader(Student student){
        if (this.equals(student.getKClass())){
            this.leader = student;
            if (attachedStudent!=null){
                attachedStudent.printAttachedMsg(this);
            }else if(attachedTeacher!=null){
                attachedTeacher.printAttachedMsg(this);
            }
        }else{
            System.out.println("It is not one of us.");
        }

    }
    public boolean isLeader(Student student){
        return student.equals(this.leader);
    }

    public Student getLeader(){
        return leader;
    }

    public void attach(Teacher teacher){
        this.attachedTeacher = teacher;
    }

    public void attach(Student student){
        this.attachedStudent = student;
    }
}
