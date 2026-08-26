public class Student {
    // Variables
    String name = "Rahul";
    int age = 21;
    String course = "Java";
    String college = "ABC College";
    int marks = 85;

    //constructor
    public Student() {
        System.out.println("student object is created");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);
        System.out.println("Marks: " + marks);
    }

    // Method
    public void study() {
        System.out.println(name + " is studying");
    }

    // Method with parameters
    public void calculateTotal(int a, int b) {
        int total = a + b;
        System.out.println("Total: " + total);
    }
}