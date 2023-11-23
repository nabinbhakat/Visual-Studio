public class Last_ocurrence {
    public static int find(int arr[],int key,int i){
        // if(i<0)
        //     return -1;
        // if(arr[i]==key)
        //     return i;
        // return find(arr, key, i-1);

        if(i==arr.length)
            return -1;

        int isFound=find(arr, key, i+1);
        if(isFound == -1 && arr[i]==key)
            return i;

        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,7,3,2,1,5,7,9,3};
        System.out.println(find(arr, 1, 0));
    }
}
