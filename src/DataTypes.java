import java.awt.*;

public class DataTypes {
    public static void main(String[] args) {
        datatypes();
        System.out.println("program completed");

    }

    //method define
    public static void datatypes() {
        //print is used to print the string or word in a line, cursor is present in the same line after print the data/string.
        System.out.print("HELLO WORLD");
        //println is used to print the string or word in a line, then after cursor moved to the next line
        System.out.println("HELLO WORLD");
        System.out.print("HELLO WORLD");

        //variable is used to store the data
        //java is case-sensitive
        //java data types - 8 types primitive -8
        //byte short
        int a = 35;//mostly used
        long l = 435L;
        //double
        float d = 23.4f;
        char c = 'v';
        boolean b = false;
        //non-primitive data type
        String value = "print to console";
        System.out.println(value);
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(b);
        System.out.println(l);

        /*
        compilation --> run
        if compilation erros --> not run
         */

        //System.out.println/printf is used to print the data in the console
        //System.out.println/printf is used to concationation of different data types
        //int int
        System.out.println(25 + 25);
        //String int
        System.out.println("value is " + 25);
        //String float
        System.out.println("float value     " + 29.8f);

    }
}
