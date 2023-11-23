/*    Subarrays of arrays - Contigous/Continous part of array
 *    Example-[2,4,6,8] 
 *    Possible subarrays- {2},{2,4},{2,4,6},{2,4,6,8}
 *                    {4},{4,6},{4,6,8}
 *                    {6},{6,8}
 *                    {8}
 *    Formla for total numbers of subarrays = n(n+1)/2
 */

 //   Kadane's Algorithm
 //   Time Complexity- O(n)

public class Max_Subarr_sum_III {
    public static void print_subarr_sum(int a[]) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            curr_sum+=a[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.println("Maximum sum is "+max_sum);
    }
    public static void main(String[] args) {
        //int a[]={1,-2,6,-1,3};
        //int a[]={2,4,6,8};
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        print_subarr_sum(a);
    }
}