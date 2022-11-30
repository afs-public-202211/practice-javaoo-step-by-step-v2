package ooss;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        this.leader = null;
    }
    public Klass(int number, Student leader) {
        this.number = number;
        this.leader = leader;
    }

    public void assignLeader(Student leader){
        if(leader.getKlass().getNumber() == this.number){
        this.leader = leader;
        this.leader.setKlassLeaderNum(this.number);
        } else{
            System.out.println("It is not one of us.");
        };
    }

    public boolean isLeader(Student student){
        if (this.leader != null){
            return student.getId() == this.leader.getId();}
        else{
            return false;}
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Klass)) return false;

        Klass klass = (Klass) obj;

        return klass.number == number;
    }

    public int getNumber(){
        return number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setNumber(int number){
        this.number = number;
    }

}
