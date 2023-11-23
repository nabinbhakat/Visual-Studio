import java.util.*;
public class Linear_search {
    public static int search(int arr[],int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={3,4,6,8,2,9,1};
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int index=search(arr, n);
        if(index==-1){
            System.out.println("Elemnt not fond");
        }
        else{
            System.out.println("Element is at index:"+index);
        }
        sc.close();
    }
}
