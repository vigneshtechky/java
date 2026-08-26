public class Vignesh {
    //constructor
    public Vignesh() {
        System.out.println("constructor is there, thats why object is created");
    }

    //variables
    //methods
    //blueprint
    String organ = "kidney";
    String colour = "dusky";
    String name = "Vignesh";

    //method-->it is a block of code that executes a specific work/task
    public void dialyasis() {
        System.out.println("diyalisis performd on " + organ);
    }

    //method --> good in mathematics
    public void maths() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum is " + sum);
    }

    //method with parameters
    public void calculation(int a, int b) {
        int sum = a + b;
        System.out.println("sum of "+a+" + "+b +" is " + sum);
    }


}
