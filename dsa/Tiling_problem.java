/*  
 *      Given a '2Xn' board and tiles of size '2X1' , count the number of
 *      ways to tile the given board  using the 2X1 tiles.
 *      (A tile can be placed horizontally or vertically) 
 * 
 *              choices- horizontal
 *                       vertical
 */
public class Tiling_problem{
    public static int solve(int n){
        //base case
        if(n==0|n==1)
            return 1;
        
        //choices
        //vertical
        int v=solve(n-1);
        //horizontal
        int h=solve(n-2);
        //total
        int ways=h+v;

        return ways;
    }
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}