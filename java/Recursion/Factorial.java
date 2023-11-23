public class Factorial {
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        int f=fac(n-1);
        f=f*n;
        return f;
    }
    public static void main(String[] args) {
        int n=5;
        int f=fac(n);
        System.out.println(f);
    }
}
