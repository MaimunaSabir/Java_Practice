class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Teacher class
class Teacher extends Person {
    String subject;
    int salary;

    Teacher(String n, int a, String s, int sal) {
        super(n, a);
        subject = s;
        salary = sal;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

// Student class
class Student extends Person {
    int rollNo;
    int marks;

    Student(String n, int a, int r, int m) {
        super(n, a);
        rollNo = r;
        marks = m;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Ali", 35, "Math", 50000);
        Student s = new Student("Maimuna", 20, 147, 85);

        System.out.println("----- Teacher Info -----");
        t.displayInfo();

        System.out.println("\n----- Student Info -----");
        s.displayInfo();
    }
}