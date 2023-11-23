/*
 *      Time Complexity: Average O(nlogn) ,Worst O(n^2)
 *      Space Complexity: O(1)
 */
public class Quick_Sort{
    public static int partition(int arr[],int l,int r){
        int pivot=arr[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(arr[j]<=pivot){
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
            
        }
        i++;
        int t=pivot;
        arr[r]=arr[i];
        arr[i]=t;
        return i;
    }
    public static void sort(int arr[],int l,int r){
        if(l>=r)
            return;
        int p=partition(arr,l, r);
        sort(arr, l, p-1); //p-1 and p+1 because arr[p] is in right position we just need
        sort(arr,p+1,r);  // to sort its right and left part of p indx
    }
    public static void main(String[] args) {
        int arr[]={7,4,2,6,9,2,1,6,3,2,7,4,3,8};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}