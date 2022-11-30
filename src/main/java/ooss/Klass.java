package ooss;

public class Klass {
    private int id;
    private Student leader;

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
        }else{
            System.out.println("It is not one of us.");
        }

    }
    public boolean isLeader(Student student){
        return student.equals(this.leader);
    }
}
