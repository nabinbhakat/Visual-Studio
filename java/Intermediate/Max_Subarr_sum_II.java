/*
 *    Subarrays of arrays - Contigous/Continous part of array
 *    Example-[2,4,6,8] 
 *    Possible subarrays- {2},{2,4},{2,4,6},{2,4,6,8}
 *                    {4},{4,6},{4,6,8}
 *                    {6},{6,8}
 *                    {8}
 *    Formla for total numbers of subarrays = n(n+1)/2
 */

 //   Prefix Array Approach
 //   Time Complexity- O(n^2)

public class Max_Subarr_sum_II {
    public static void print_subarr_sum(int a[]) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        
        //making prefix array
        int prefix_arr[]=new int[a.length];
        //calculating prfix array
        prefix_arr[0]=a[0];
        for(int i=1;i<a.length;i++){
            // curr_sum+=a[i];
            // prefix_arr[i]=curr_sum;
            // if(curr_sum>max_sum){
            //     max_sum=curr_sum;
            // }
            prefix_arr[i]=prefix_arr[i-1]+a[i];
        }
        curr_sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                // curr_sum=prefix_arr[j]-prefix_arr[i];
                // if(curr_sum>max_sum){
                //     max_sum=curr_sum;
                // }
                // curr_sum=0;
                curr_sum=i==0 ? prefix_arr[j] : prefix_arr[j]-prefix_arr[i-1];
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
        //int a[]={2,4,6,8};
        print_subarr_sum(a);
    }
}