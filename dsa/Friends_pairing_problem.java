/*
 *      Given n friends,each one can remain single or can be paired up with some
 *      other friend.Each friend can be paired only once. Find out the total no. of 
 *      ways in which friends can remain single or can be paired up. 
 * 
 *      Ways =     f(n-1)  +     (n-1)  *   f(n-2)
 *              (for single)   (Choices)  (for pair)
 */
public class Friends_pairing_problem {
    public static int findWays(int n){
        //base
        if(n==1||n==2)
            return n;
        //work
        //single
        int single=findWays(n-1);
        //pairing
        int pair=findWays(n-2);

        //total
        int ways=single+(n-1)*pair;
        return ways;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(findWays(n));
    }
}
