/*
 *      Pairs in arrays
 *    Example-[2,4,6,8] 
 *    Possible pairs- {2,4},{2,6},{2,8}
 *                    {4,6},{4,8}
 *                    {6,8}
 *    Formula for total numbers of pairs = n(n-1)/2
 */
import java.util.*;
public class Pairs_in_Array {
    public static void print_pairs(int a[],int n) {
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("{"+a[i]+","+a[j]+"} ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print_pairs(arr, n);
        sc.close();
    }
}
