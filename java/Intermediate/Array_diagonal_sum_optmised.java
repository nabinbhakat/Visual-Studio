// Diagonal Sum of 2D Array(nXn)
//Time Complexity -O(n)
// Primary Diagonal Condition:   i==j
//Secondary Diagonal Condition:  (i+j)=n-1
public class Array_diagonal_sum_optmised {
    //print array
    public static void print(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Calculating sum of diagonals
    public static void diagonal_sum(int a[][]) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            //primary diagonal
            sum+=a[i][i];
            //Secondary diagonal
            if(i!=a.length-1-i){  //for overlapping codition like a[1][1] in 3X3
                sum+=a[i][a.length-1-i];
            }
        }
        System.out.println("Diagonal Sum="+sum);
    }
    public static void main(String[] args) {
         //int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(array);
        diagonal_sum(array);
    }
}
