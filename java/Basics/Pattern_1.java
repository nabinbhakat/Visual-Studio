/*
    Print the following pattern
 *      ****
 *      ***
 *      **
 *      *
*/
public class Pattern_1 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
/*
 *        OR
 *     (n-i)+1
 *     n->total no of lines
 *     i->no. of lines 
*/