public class Ashok {
    public static void main(String[] args) {

        //method name is vignesh
        vignesh();
        System.out.println("============================");

        //2nd object object name is vinay
        Vignesh vinay = new Vignesh();
        vinay.organ = "heart";
        System.out.println("organ: " + vinay.organ);
        vinay.colour = "white";
        System.out.println("colour: " + vinay.colour);
        vinay.name = "vinay";
        System.out.println("name: " + vinay.name);
        vinay.dialyasis();
        vinay.maths();
        vinay.calculation(100,105);



    }

    public static void vignesh() {
        //this is the way to create a object by using new Keyword
        //object --> is a instance/copy of a class
        //object name is vig
        Vignesh vig = new Vignesh();
        System.out.println("name: " + vig.name);
        System.out.println("colour: " + vig.colour);
        System.out.println("organ: " + vig.organ);
        vig.dialyasis();
        vig.maths();
        int num1 =20;
        int num2 =25;
        vig.calculation(num1, num2);
    }


}
