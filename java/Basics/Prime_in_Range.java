import java.util.*;
public class Prime_in_Range {
    public static boolean isprime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime_range(int n) {
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        prime_range(n);
        sc.close();
    }
}
