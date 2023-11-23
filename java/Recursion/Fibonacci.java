/*
 *     Nth Fibonnaci numbers
 *     0,1,1,2,3,5,8....
 *      a1=0,a2=1
 *      a3=a1+a2
 *      an=an-1+an-2
 */
public class Fibonacci {
    public static int fun(int n){
        if(n==0 || n==1)
            return n;
        int fnm1=fun(n-1);
        int fnm2=fun(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fun(n));
    }
}
