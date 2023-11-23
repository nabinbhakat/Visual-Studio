/*
 *    Subarrays of arrays - Contigous/Continous part of array
 *    Example-[2,4,6,8] 
 *    Possible subarrays- {2},{2,4},{2,4,6},{2,4,6,8}
 *                    {4},{4,6},{4,6,8}
 *                    {6},{6,8}
 *                    {8}
 *    Formla for total numbers of subarrays = n(n+1)/2
 */

 //   Brute Force Approach
public class Subarray_sum {
    public static void print_subarr_sum(int a[]) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                System.out.print("Sum of subarray {");
                for(int k=i;k<=j;k++){
                    if(k==j){
                        System.out.print(a[k]);
                    }else{
                        System.out.print(a[k]+",");
                    }
                    sum+=a[k];
                }
                System.out.print("} is : "+sum+"\n");
                sum=0;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8};
        print_subarr_sum(a);
    }
}
