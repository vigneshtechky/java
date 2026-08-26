package methods;

public class Vignesh {
    public static void main(String[] args) {
        //method calling
        vigneshDetails();


    }

//method define
    public static void vigneshDetails() {
        //method body/ block of code
        Student vig = new Student();
        System.out.println("default name: " + vig.name);
        System.out.println("default college: " + vig.college);

        //"." -->dot operator
        vig.name = "vignesh";
        String collegeName = "xyz collegge";
        //without return type
        vig.whoisstudyingvoid();
        vig.whatCollegevoid(collegeName);

        //with return type
        String returnName =vig.whoisStudyingwithreturn();
        System.out.println("method returned Name: "+ returnName);

        String coll = "gist college";
        vig.whatcollegewithreturn(coll);
        System.out.println("method returned college: "+ coll);

    }
}
