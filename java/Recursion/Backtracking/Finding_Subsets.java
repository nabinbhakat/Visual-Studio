/*
 *   {abc}-{a},{b}{c},{ab},{bc},{ac},{abc}   
 * 
 *              Subsets-:2^n
 * 
 *               a , b , c
 *              /         \     \
 *             a,b c       b,c   c
 *           y/   \n      y/ \n  
 *         ab,c    a,c    bc  b
 *         y/ \n   y/\n
 *        abc  ab  ac a
 */
public class Finding_Subsets {
    public static void findSubset(String s,int i,String ans){
        //base case;
        if(i==s.length()){
            if(ans.length()==0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }
        //recursion
        findSubset(s, i+1, ans+s.charAt(i));

        //backtrack
        findSubset(s, i+1, ans);
    }
    public static void main(String[] args) {
        String s="abc";
        findSubset(s, 0, "");
    }
}
