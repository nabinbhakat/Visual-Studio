public class Backtracking_On_Array {
    public static void chngArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            print(arr);
            return;
        }
        //recursion
        arr[i]=val;
        chngArr(arr, i+1, val+1);
        //backtrack
        arr[i]-=2;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        chngArr(arr, 0, 1);
        print(arr);
    }
}
