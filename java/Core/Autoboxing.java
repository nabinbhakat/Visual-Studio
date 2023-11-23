public class Autoboxing {
    public static void main(String[] args) {
        Integer iob=100; //autobox an int
        int i=iob; //auto-unbox
        System.out.println(i+" "+iob);
    }
}
/*
Autoboxing is the process by whicha primitive type is 
automatically encapsulated (boxed) into its equivalent type wrapper 
whenever an object of that type is nedeed

Auto-unboxing is the process by which the value of a boxed object is 
automatically extracted (unboxed) from a type wrapper when its value 
is needed
*/