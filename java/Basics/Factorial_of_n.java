import java.util.*;
public class Factorial_of_n {
    public static int factorial(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("Result= "+result);
        sc.close();
    }
}
