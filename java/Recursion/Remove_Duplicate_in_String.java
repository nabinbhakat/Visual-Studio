public class Remove_Duplicate_in_String {
    public static void remove(String s,int indx,StringBuilder newS,boolean map[]){
        //base case
        if(indx==s.length()){
            System.out.println(newS);
            return;
        }
        
        //work
        char curr=s.charAt(indx);
        if(map[curr-'a']==true)
            remove(s, indx+1, newS, map);
        else{
            map[curr-'a']=true;
            remove(s, indx+1, newS.append(curr), map);
        }

    }
    public static void main(String[] args) {
        String s="goodville";
        remove(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
