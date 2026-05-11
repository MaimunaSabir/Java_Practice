class Person {

    public String name = "Maimuna";

    private int age = 20;

    protected String city = "Karachi";

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person();

        p.display();
    }
}