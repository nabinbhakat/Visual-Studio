/*
    Print the following pattern
 *      *
 *      **
 *      ***
 *      ****
 */
public class Pattern_0 {
    public static void main(String args[]){
        for(int i=1;i<5;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
