package nulltype;

public class Employee {
    //variable declaration
    //global variables
    //primitive datatypes --> default values
    //int -->0
    int age;

    //non=primitive datatype
    //default value -->null
    String name;

    //Consturctor
    public Employee() {

    }

    //float -->0.0
    float salary;
    //char  -->\u0000-->unicode system -->
    char grade;

    public void printAge(){
        System.out.println(age);
    }
    public void printSalary(){
        System.out.println(salary);
    }
    public void printGrade(){
        grade = 'A';

        System.out.println(grade);
    }

    public void expenses(){
        //local variables
        int expenses=20000;
        System.out.println(expenses);
    }

    public void printName(){
        System.out.println(name);
    }



}
