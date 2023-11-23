public class Shortest_path {
    public static void findPath(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y+=1;
            }
            else if(str.charAt(i)=='S'){
                y-=1;
            }
            else if(str.charAt(i)=='E'){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        float path=(float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            System.out.println("Shortest Path="+path);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        findPath(path);
    }
}
