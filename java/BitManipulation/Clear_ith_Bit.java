public class Clear_ith_Bit {
    public static int Clearbit(int n,int i) {
        int bitmask=~(1<<i);
        return (n & bitmask);
    }
    public static void main(String[] args) {
        System.out.println(Clearbit(10, 1));
    }
}
