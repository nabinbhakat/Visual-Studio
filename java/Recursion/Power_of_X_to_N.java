/*
 *      Time complexity-O(n)
 *      2^5:              32
 *           2* 2^4       2* 16
 *           2* 2^3       2* 8
 *           2* 2^2       2* 4  
 *           2* 2^1->2  ->|
 */
public class Power_of_X_to_N{
    public static int pow(int x,int n){
        if(n==1)
            return x;
        int power= x * pow(x, n-1);
        return power;
    }
    public static void main(String[] args) {
        int x=2;
        System.out.println(pow(x, 10));
    }
}