class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager manages team");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Manager();

        e.work();
    }
}