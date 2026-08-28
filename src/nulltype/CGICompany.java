package nulltype;

public class CGICompany {

    public static void main(String[] args) {
        Employee ashok = new Employee();
        System.out.println(ashok);

        ashok = null;
        ashok.printName();
        System.out.println(ashok.age);


    }
}
