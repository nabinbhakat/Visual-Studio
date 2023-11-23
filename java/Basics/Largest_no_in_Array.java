import java.util.*;
public class Largest_no_in_Array {
    private static void getLargest(int a[]) {
        int max=Integer.MIN_VALUE; // -infinity(The lowest value that integer can store)
        int min=Integer.MAX_VALUE; // +infinity(The largest value that integer can store)
        for(int i=0;i<a.length;i++){
            if(a[i]>max){     // for finding largest value
                max=a[i]; 
            }
            if(a[i]<min){
                min=a[i];   //for finding minimum value
            }
        }
        System.out.println("Largest value:"+max);
        System.out.println("Smallest value:"+min);
        System.out.println(Float.MAX_VALUE);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={5,7,3,8,4,9,1};
        getLargest(a);
        sc.close();
    }
}
