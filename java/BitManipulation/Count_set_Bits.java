// Time Complexity -O(log n)
// as representation of n in binary bits takes maximum of log n or(log n+1) bits
//  n=log n+1;  
public class Count_set_Bits {
    public static void CountSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("No. of set bits is "+count);
    }
    public static void main(String[] args) {
        CountSetBits(10);
        CountSetBits(15);
        CountSetBits(8);
    }
}
