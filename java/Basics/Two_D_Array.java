import java.util.*;
public class Two_D_Array {
    //print 2-D array
    public static void print(int arr[][]) {
        System.out.println("Elements of the 2-D array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //search in 2-D array
    public static void search(int arr[][],int key) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Element found at("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("ELement not found");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creation of 2-D array
        int matrix[][]=new int[3][3];
        //input in 2-D array
        System.out.println("Enter elemnts of the 2-D array");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        print(matrix);
        search(matrix, 4);
        search(matrix, 11);
        sc.close();
    }
}
