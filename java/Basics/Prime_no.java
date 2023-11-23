import java.util.*;
public class Prime_no {
    
    //normal code for checking prime

    // public static boolean isprime(int n) {
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //optimized code for checking prime

    public static boolean isprime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){    //instead of 2 to n-1 we go 2 to sqrt(n)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}
