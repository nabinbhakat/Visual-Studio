public class Print_No_in_dec_order{
    public static void print(int n) {
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        int N=10;
        print(N);
    }
}