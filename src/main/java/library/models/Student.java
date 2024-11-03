package library.models;

public class Student extends Person {
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        super(name);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public int getPriority() {
        return gradeLevel;
    }
}