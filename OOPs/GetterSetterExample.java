class Student {

    private String name;
    private int marks;

    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        marks = m;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Maimuna");
        s.setMarks(90);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}