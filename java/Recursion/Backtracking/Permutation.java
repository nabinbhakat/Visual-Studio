/*
 *      Permutation of n element(char,int) -> n! = nX(n-1)X(n-2)....1
 *      ex-Permutation of a,b,c-> abc
 *                                acb
 *                                bac
 *                                cab
 *                                cba
 */
public class Permutation {
    public static void findPermutation(String org,String ans){
        //base case
        if(org.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<org.length();i++){
            char curr=org.charAt(i);
            String newstr=org.substring(0, i)+org.substring(i+1);
            findPermutation(newstr, ans+curr);

        }
    }
    public static void main(String[] args) {
        String s="abc";
        findPermutation(s, "");
    }
}
