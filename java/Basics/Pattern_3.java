/*
    Print the following pattern
 *      A
 *      BC
 *      DEF
 *      GHIJ
*/
public class Pattern_3 {
    public static void main(String[] args) {
        int a=64;   //char ch='A'
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                a+=1;  
                System.out.print((char)(a));
                //print(ch)
                //ch++
            }
            System.out.println();
        }
    }
}
