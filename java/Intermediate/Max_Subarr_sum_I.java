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
 //   Time Complexity- O(n^3)


public class Max_Subarr_sum_I {
    public static void print_subarr_sum(int a[]) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    curr_sum+=a[k];
                }
                if(curr_sum>max_sum){
                    max_sum=curr_sum;
                }
                curr_sum=0;
            }
        }
        System.out.println("Maximum sum is "+max_sum);
    }
    public static void main(String[] args) {
        int a[]={1,-2,6,-1,3};
        print_subarr_sum(a);
    }
}
