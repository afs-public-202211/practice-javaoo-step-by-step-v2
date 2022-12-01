package ooss;

public class Student extends Person {

    private Klass kclass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String initial = String.format("My name is %s. I am %d years old. I am a student."
                , super.getName(), super.getAge());
        if (kclass != null) {
            if (kclass.isLeader(this)) {
                initial = initial.concat(String.format(" I am the leader of class %d.",
                        kclass.hashCode()));
            } else {
                initial = initial.concat(String.format(" I am in class %d.",
                        kclass.hashCode()));
            }
        }
        return initial;
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

    public boolean isIn(Klass kclass) {
        return this.kclass == kclass;
    }

    public void join(Klass kclass) {
        this.kclass = kclass;

    }

    public Klass getKClass() {
        return kclass;
    }

    public void printAttachedMsg(Klass kclass) {
       super.printAttachedMsg("student",kclass);
    }
}
