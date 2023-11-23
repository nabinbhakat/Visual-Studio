public class Even_Odd_Bit_Manipulation {
    public static void checkEvenOdd(int n) {
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(11);
        checkEvenOdd(7);
        checkEvenOdd(50);
    }
}
