package ooss;

public class Klass {
    private final int number;

    public Klass(int number) {
        this.number = number;
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
}
