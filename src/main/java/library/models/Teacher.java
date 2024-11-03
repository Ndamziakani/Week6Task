package library.models;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public int getPriority() {
        return 3;
    }
}