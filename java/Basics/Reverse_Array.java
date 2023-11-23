import java.util.*;
public class Reverse_Array {
    public static void reverse(int a[],int n) {
            for(int i=0;i<n/2;i++){
                int t=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=t;
            }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, n);
        System.out.println("Reverse array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
