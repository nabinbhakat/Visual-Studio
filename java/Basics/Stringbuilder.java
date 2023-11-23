// If we string for following operation it will take O(n^2) time
//but if we use StringBuilder it will take O(n) time

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char c='a';c<='z';c++){
            sb.append(c);
        }
        System.out.println(sb);
    }
    
}
