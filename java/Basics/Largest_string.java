// using compareTo() to find largest string in a string array
//               Str1.compareTo(Str2)
//   compareTo() gives three values: 0 -strings are equal
//                                  < 0 (-ve) -Str2>Str1
//                                  > 0 (+ve) -Str1>Str2
public class Largest_string {
    public static void main(String[] args) {
        String s[]={"mango","apple","peach","guava"};
        String largest=s[0];
        for(int  i=1;i<s.length;i++){
            if(largest.compareTo(s[i])<0){
                largest=s[i];
            }
        }
        System.out.println("Largest string="+largest);
    }
}
