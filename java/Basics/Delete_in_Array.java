//  10 20 30 40 50
//  10 20 
//
import java.util.*;
public class Delete_in_Array {
    //deletion of element in array

    //1st approach
    // public static void del(int a[],int key) {
    //     int found=0;
    //     for(int i=0;i<a.length;i++){
    //         if(i==(a.length-found)){
    //             break;
    //         }
    //         if(a[i]==key){
    //             found++;
    //         }
    //         if(found>0){
    //             a[i]=a[i+1];
    //         }
    //     } 
    //     System.out.println("Array:");
    //     for(int i=0;i<(a.length-found);i++){
    //         System.out.print(a[i]+" ");
    //     }
        
    // }

    //2nd approach
    public static void del(int a[],int key) {
        int found=0;
        for(int i=0;i<a.length;i++){
            if(found>0){
                a[i-1]=a[i];
            }
            if(a[i]==key){
                found++;
            }
        } 
        System.out.println("Array:");
        for(int i=0;i<(a.length-found);i++){
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
        System.out.println("Enter element to be deleted:");
        int x=sc.nextInt();
        del(a,x);
        sc.close();
    }
}
