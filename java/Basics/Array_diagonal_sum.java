// Diagonal Sum of 2D Array(nXn)
//Brute Force Approach
//Time Complexity -O(n^2)
// Primary Diagonal Condition:   i==j
//Secondary Diagonal Condition:  (i+j)=n-1

public class Array_diagonal_sum {
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
        //primary diagonal
        int sum_sd=0,sum_pd=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sum_pd+=a[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal Sum="+sum_pd);
        //secondary diagonal
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i+j==a.length-1){
                    sum_sd+=a[i][j];
                }
            }
        }
        System.out.println("Secondary Diagonal Sum="+sum_sd);
        int sum=sum_pd+sum_sd;
        if((a.length)%2==0){
            System.out.println("Diagonal Sum="+sum);
        }
        else{
            int mid=(a.length)/2;
            sum-=a[mid][mid];
            System.out.println("Diagonal Sum="+sum);
        }
    }
    public static void main(String[] args) {
        //int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(array);
        diagonal_sum(array);
    }

}
