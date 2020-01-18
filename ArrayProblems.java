import java.util.*;
public class ArrayProblems
{
    public static void main(String[] args){
        int[][] mat = bullsEye(); 
        for(int row = 0; row<mat.length; row++){
            System.out.println(Arrays.toString(mat[row]));
        }
    }

    /*
     * returns an array with a diagonal of 1's going from the 
     * topleft to bottomright corner
     */
    public static int[][] bullsEye(){
        //left to right, top to bottom
        int[][] mat = new int[6][6];
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                for(int i = 0; i < mat.length;i++){
                    if(row == mat.length/2 && col == mat.length/2){
                    mat[row][col] = 1;
                    }
                    if(row == 0 || col == 0 || row == mat.length-1 || col == mat.length-1){
                        mat[row][col] = 1;
                        }
                }
            }
        }
        return mat;
    }

    /*
     * returns an array with a diagonal from topleft to bottomright
     * and topright to bottomleft
     */
    public static int[][] bothDiagonal(){
        int[][] mat = diagonal();
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(row + col == 9){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }
     public static int[][] diagonal(){
         int[][] mat = new int[7][7];

        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(row == col){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }

    /*
     * returns an arr with every other column all 1's
     */
    public static int[][] everyOtherCol(){
        int[][] mat = new int[10][10];
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(col % 2 == 1){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }

    /*
     * returns a 2D array with every other row all 1's
     */
    public static int[][] everyOtherRow(){
        int[][] mat = new int[10][10];
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(row % 2 == 1){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }

    /*
     * returns a CheckerBoard pattern
     */
    public static int[][] checkerBoard(){
        int[][]mat = new int[10][10]; //TODO
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(col % 2 == 1 && row % 2 == 0){
                    mat[row][col] = 1;
                }
                if(col % 2 == 0 && row % 2 == 1){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }
    //Make the boarder all 1's and the rest all 0's
    public static int[][] boarder(){
        int[][]mat = new int[10][10];
        return mat;
    }

}
