public class Print <T> {
    T thingtoPrint;
    public Print(T thingtoPrint){
        this.thingtoPrint=thingtoPrint;
    }
    public void print(){
        System.out.println(thingtoPrint);
    }
    
}
