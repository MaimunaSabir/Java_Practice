
final class Student {

    private final String name;
    private final int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Maimuna", 147);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
    }
}