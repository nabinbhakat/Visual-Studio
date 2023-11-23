public class Clear_last_ith_Bits {
    public static int ClearithBits(int n,int i) {
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearithBits(15,2));
    }
}
