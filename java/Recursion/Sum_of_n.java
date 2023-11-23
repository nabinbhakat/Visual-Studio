public class Sum_of_n{
    public static int sum(int n){
        if(n==1)
            return 1;
        int x=sum(n-1);
        int s=x+n;
        return s;
    }
    public static void main(String[] args) {
        int n=10;
        int s=sum(n);
        System.out.println("Sum of "+n+" numbers is "+s);
    }
}