public class Trapping_rainwater {
    public static int calc_vol(int a[]) {
        if(a.length<=2){
            return 0;
        }
        int vol=0;
        //corner cases variable
        int asc=0,desc=0;
        //creating auxillary array
        
        //calculating right max boundary
        int right_max[]=new int[a.length];
        right_max[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            right_max[i]=Math.max(a[i],right_max[i+1]);
            
            //checking descending condition
            if(right_max[i]<right_max[i+1]){
                desc++;
            }
        }
        if(desc==a.length-1)
            return 0;
        //calculating left max boundary
        int left_max[]=new int[a.length];
        left_max[0]=a[0];
        for(int i=1;i<a.length;i++){
            left_max[i]=Math.max(a[i],left_max[i-1]);

             //checking descending condition
            if(left_max[i-1]<left_max[i]){
                asc++;
            }
        }

        if(asc==a.length-1)
            return 0;

        //calcuating trapped rainwater
        int vol_pbar=0;
        for(int i=0;i<a.length;i++){
            int water_level=Math.min(left_max[i],right_max[i]);
            vol_pbar=water_level-a[i];
            vol+=vol_pbar;
        }
        return vol;
    }
    public static void main(String[] args) {
        //int array[]={4,2,0,6,3,2,5};
        //int array[]={7,6,5,4,3,2,1};
        int array[]={6,3};
        int trap_water=calc_vol(array);
        System.out.println("Total trapped water="+trap_water);
    }
}
