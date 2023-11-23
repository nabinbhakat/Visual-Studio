/*
 *      Print all binary strings of size n without consecutive ones
 *      ex: For n=3
 *          000
 *          001
 *          010
 *          100
 *          101
 */
public class Binary_String_Problem {
    public static void print(int n,int lastplace,String s){
        //base case
        if(n==0){
            System.out.println(s);
            return;
        }
        //work
        print(n-1,0, s+"0");
        if(lastplace==0){
            print(n-1, 1, s+"1");
        }   
    }
    public static void main(String[] args) {
        int n=3;
        print(n, 0, new String(""));
    }
}
