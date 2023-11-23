public class Update_ith_Bit {
    public static int Setbit(int n,int i) {
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int Clearbit(int n,int i) {
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int Updatebit(int n,int i,int newBit) {
        n=Clearbit(n,i);
        int bitmask=newBit<<i;
        return n|bitmask;

        // or using set bit function for set
        //and clear bit function for clear
        // if(newBit==0){
        //     n=Clearbit(n,i);
        // }
        // else{
        //     n=Setbit(n,i);
        // }
        // return n;
    }
    public static void main(String[] args) {
        System.out.println(Updatebit(10, 2, 1));
    }
    
}
