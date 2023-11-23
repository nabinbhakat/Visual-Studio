/*
 *      Time complexity-O(log n)
 *      2^5:              32
 *      case 1: If n is even 
 *              x^n= x^n/2 * x^n/2
 *      case 2:If n is odd
 *              x^n= x * x^n/2 *x^n/2
 */
public class Power_of_X_to_N_Optimised {
    public static int pow(int x,int n){
        if(n==0)
            return 1;
        int halfpower=pow(x,n/2);
        int power=halfpower*halfpower;
        if(n%2!=0)
            power =x* power;
        return power;
    }
    public static void main(String[] args) {
        int x=2;
        System.out.println(pow(x, 10));
    }
}
