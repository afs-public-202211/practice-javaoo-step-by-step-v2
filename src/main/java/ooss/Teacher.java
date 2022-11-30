package ooss;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    public ArrayList<Klass> kclasses = new ArrayList<>();
    public Teacher(int id, String name, int age ){
        super(id,name,age);
    }

    private String generateClassesString(){
        return kclasses.stream()
                .map(kclass -> kclass.hashCode())
                .map(kclass->kclass.toString())
                .collect(Collectors.joining(", "));

    }

    @Override
    public String introduce() {
        if (!kclasses.isEmpty()){
            return String.format("My name is %s. I am %d years old. I am a teacher. I teach Class %s.",
                    super.getName(),
                    super.getAge(),
                    generateClassesString());
        }
        return String.format("My name is %s. I am %d years old. I am a teacher.", super.getName(), super.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Teacher teacher = (Teacher) o;

        return super.getId() == teacher.getId();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + super.getId();
        return result;
    }

    public boolean belongsTo(Klass kclass){
        return kclasses.contains(kclass);
    }

    public void assignTo(Klass kclass){
        this.kclasses.add(kclass);

    }

    public boolean isTeaching(Student student){
        return kclasses.stream()
                .anyMatch(kclass -> student.getKClass()== kclass);
    }
    public void printAttachedMsg(Klass kclass) {
        super.printAttachedMsg("teacher",kclass);
    }

}