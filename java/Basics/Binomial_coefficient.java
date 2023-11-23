/*
 *  formula -  nCr = n!/(n-r)!*r!
 */
import java.util.*;
public class Binomial_coefficient {
    public static int fac(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int bcoeff(int n,int r){
        int coeff;
        coeff= fac(n)/(fac(n-r)*fac(r));
        return coeff;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter r:");
        int r=sc.nextInt();
        int result=bcoeff(n, r);
        System.out.println("Binomial coefficient="+result);
        sc.close();
    }
}
