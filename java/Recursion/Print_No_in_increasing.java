import java.util.*;
public class Print_No_in_increasing {
    public static void printNo(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        printNo(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        printNo(n);
        sc.close();
    }
}
