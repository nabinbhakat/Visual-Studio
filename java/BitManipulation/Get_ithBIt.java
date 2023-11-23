public class Get_ithBIt {
    public static void getBit(int n,int i) {
        int bitmask=1<<i;
        if((n&bitmask)!=0){
            System.out.println(i+"th bit is 1");
        }
        else{
            System.out.println(i+"th bit is 0");
        }
    }
    public static void main(String[] args) {
        getBit(10, 3);
        getBit(5, 2);
        getBit(9, 1);
    }
}
