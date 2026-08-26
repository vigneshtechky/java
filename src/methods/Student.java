package methods;

public class Student {
    String name = " ";
    String college = " ";

    //without arguments/no parameters
    public void whoisstudyingvoid() {
        System.out.println(name + " is studying");
    }

    //with parameters
    public void whatCollegevoid(String str) {
        System.out.println("college name is: " + str);
    }

    //without arguments/no parameters with return type
    public String whoisStudyingwithreturn() {
       return name;
    }

    //with parameters with return type
    public String whatcollegewithreturn(String college) {
        return college;
    }



}
