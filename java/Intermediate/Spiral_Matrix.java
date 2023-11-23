
/*
 *      Spiral matrix
 *      1  2  3  4
 *      5  6  7  8
 *      9  10 11 12
 *      13 14 15 16
 *      
 *      output= 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 */

import java.util.Scanner;

public class Spiral_Matrix {
    //spiral print
    public static void s_print(int a[][]) {
        int start_row=0;
        int start_col=0;
        int end_row=a.length-1;
        int end_col=a[start_row].length-1;
        while(start_row<=end_row && start_col<=end_col){
            
            //top
            for(int i=start_col;i<=end_col;i++){
                System.out.print(a[start_row][i]+" ");
            }

            //right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(a[i][end_col]+" ");
            }

            //bottom
            for(int i=end_col-1;i>=start_col;i--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(a[end_row][i]+" ");
            }

            //left
            for(int i=end_row-1;i>start_col;i--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(a[i][start_col]+" ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
        System.out.println();
    }
    //normal print
    public static void print(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
        //int matrix[][]={{1,2,3,4},{5,6,7,8}};
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        print(matrix);
        s_print(matrix);
        sc.close();
    }
}
