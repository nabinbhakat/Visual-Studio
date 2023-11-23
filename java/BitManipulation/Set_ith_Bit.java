public class Set_ith_Bit{
    public static int setBit(int n,int i) {
        int bitmask=1<<i;
        n=n|bitmask;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(setBit(10, 2));
        
    }
}