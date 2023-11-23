import java.util.*;;
public class Binary_to_Decimal {
    public static long decimal(long n){
        long dec=0;
        int i=0;
        while(n>0){
            long last_digit=n%10;
            dec+=last_digit*Math.pow(2,i);
            i++;
            n/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a binary number:");
        long n=sc.nextLong();
        long result=decimal(n);
        System.out.println("Decimal no: "+result);
        sc.close();
    }
}
