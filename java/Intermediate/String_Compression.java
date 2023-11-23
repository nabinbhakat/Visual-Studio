/*
 *    Give string - aaaabcccdd
 *    Result string-a4bc3d2
 */
public class String_Compression {
    public static String Compress(String str) {
        StringBuilder sb=new StringBuilder("");
        int count=1;
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++){
            
            if(ch==str.charAt(i)){
                count++;
            }
            else{
                if(count==1){
                    sb.append(ch);
                }
                else{
                    sb.append(ch);
                    sb.append(count);
                }
                ch=str.charAt(i);
                count=1;
            }
        }
        if(count==1){
            sb.append(ch);
        }
        else{
            sb.append(ch);
            sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //String s="aaaabcccdd";
        //String s="aaaaaabbbbddddekkkllooommmmp";
        String s="abcdefgh";
        System.out.println(Compress(s));
    }
}
