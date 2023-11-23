import java.util.*;
public class Del_DuplicateVal_in_array{
    public static void remove(int a[]) {
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<(a.length-1);i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a.length-1];
        System.out.println("New array");
        for(int i=0;i<=j;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter "+s+" no. of elements");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        remove(a);
        sc.close();
    }
}