import java.util.*;
public class Binary_Search {
    public static int bsearch(int a[],int key) {
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,3,4,5,6,9};
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int index=bsearch(a, n);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:"+index);
        }
        sc.close();
        
    }
}
