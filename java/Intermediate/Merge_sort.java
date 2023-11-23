/*
 *      Time complexity: O(nlogn)
 *      Space complexity: O(n)
 */
public class Merge_sort {
    public static void merge(int arr[],int l,int mid, int r){
        int lidx=l,ridx=mid+1;
        int temp[]=new int[r-l+1];
        int i=0;
        while(lidx<=mid && ridx<=r){
            if(arr[lidx]>arr[ridx]){
                temp[i]=arr[ridx++];
            }
            else{
                temp[i]=arr[lidx++];
            }
            i++;
        }
        while(lidx<=mid){
            temp[i++]=arr[lidx++];
        }
        while(ridx<=r){
            temp[i++]=arr[ridx++];
        }
        for(i=0;i<temp.length;i++){
            arr[l++]=temp[i];
        }
    }
    public static void sort(int arr[],int l,int r){
        if(l>=r)
            return;
        int mid=l+(r-l)/2;   // same as (l+r)/2 but saves Integer overflow in case of big array size
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        //int arr[]={3,6,4,2,7,9,4,2,1,5,8,3,2};
        int arr[]={6,3,9,5,2,8,-2};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
