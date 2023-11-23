public class First_occurence {
    public static int find(int arr[],int key,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==key)
            return i;
        return find(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,3,7,2,8,2,4,8,3,5};
        System.out.println(find(arr,8,0));
    }
}
