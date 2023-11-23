import java.util.*;;
public class Decimal_to_Binary {
    public static int binary(int n) {
        int binary=0;
        int i=0; 
        while(n>0){
            int rem=n%2;
            binary+=rem*Math.pow(10,i);
            i++;
            n/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Binary no:"+binary(n));
        sc.close();
    }
}
