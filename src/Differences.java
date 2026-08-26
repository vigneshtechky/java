public class Differences {
   static int intvariable =10;

    public static void main(String[] args) {
        System.out.println(intvariable);
        primitive();
        nonprimitive();
    }


    public static void primitive(){
        long starttime = System.currentTimeMillis();
        int num = 1000000;
        long sum = 0L;
        for(int i =1 ; i<=num ;i++){
            sum = sum+i;
        }
        long endtime = System.currentTimeMillis();
        System.out.println("total time for execution for primitive method: " +(endtime-starttime) +" ms");
    }

    public static void nonprimitive(){
        Long starttime = System.currentTimeMillis();
        Integer num = 1000000;
        //non-primitive
        Long sum = 0L;
        for(Integer i =1 ; i<=num ;i++){
            sum = sum+i;
        }
        Long endtime = System.currentTimeMillis();
        System.out.println("total time for execution for primitive method: " +(endtime-starttime) +" ms");
    }
}
