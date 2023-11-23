/*
 *  Searching in a 2D Array(sorted in both row and column ways)
 *  example- 
 *             1   3   5   7
 *             6   10  12  15
 *             16  19  25  30
 *             27  33  40  42
 * 
 *   3 Ways
 *   1> Brute Force Approach:- Check every element
 *      Time Complexity-: O(N^2)
 *   
 *   2> Using Binary search:- Using bs in every row
 *      Time Complexity-: O(nlogn)  since every row will take logn time so for n row nlogn
 * 
 *   3>Using Staircase search-: 
*/
public class Staircase_search {
    //print array
    public static void print(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Staircase search
    public static boolean sc_search(int a[][],int key) {
        int val;
        int j=a.length-1,i=0;
        while(j>=0&&i<a.length){
            val=a[i][j];
            if(val==key){
                return true;
            }
            if(val>key){
                j--;
            }
            else if(val<key){
                i++;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        print(matrix);
        if(sc_search(matrix, 33)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
