/*
 *    Subarrays of arrays - Contigous part of array
 *    Example-[2,4,6,8] 
 *    Possible pairs- {2},{2,4},{2,4,6},{2,4,6,8}
 *                    {4},{4,6},{4,6,8}
 *                    {6},{6,8}
 *                    {8}
 *    Formla for total numbers of subarrays = n(n+1)/2
 */
public class Subarray {
    public static void print_subarray(int a[]) {
        for(int i=0;i<a.length;i++){
            //System.out.print("{"+a[i]+"}");
            for(int j=i;j<a.length;j++){
                System.out.print("{");
                for(int k=i;k<=j;k++){
                    if(k==j){
                        System.out.print(a[k]);
                    }
                    else{
                        System.out.print(a[k]+",");
                    }
                }
                System.out.print("} ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        print_subarray(arr);
    }
}
