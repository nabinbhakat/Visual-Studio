public class Fast_Exponentiation {
    public static void Power(int n,int i) {
        int ans=1;
        while(i>0){
            if((i&1)!=0){
                ans=n*ans;
            }
            n=n*n;
            i=i>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Power(2, 10);
        Power(3, 5);
    }
}
