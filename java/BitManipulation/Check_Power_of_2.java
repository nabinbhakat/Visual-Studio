public class Check_Power_of_2 {
    public static void checkPower(long n) {
        if((n & n-1)==0){
            System.out.println(n+" is a power of 2");
        }
        else{
            System.out.println(n+" is not a power of 2");
        }
    }
    public static void main(String[] args) {
        checkPower(10);
        checkPower(1024);
        checkPower(56);
        checkPower(16);
    }
}
