import java.util.*;
public class Runner
{
    public static void main(String[] args){
        int[][] mat = bullsEye();
        for(int row = 0; row < mat.length; row++){
            System.out.println(Arrays.toString(mat[row]));
        }
    }

    public static int[][] everyOtherCol(){
        int[][] mat = new int[5][5];

        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(col % 2 == 0){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }

    public static int[][] everyOtherRow(){
        int[][] mat = new int[6][6];

        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(row % 2 == 0){
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
    public static int[][] otherDiagonal(){
        int[][] mat = new int[8][8];
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                if(row + col == (mat.length - 1)){
                    mat[row][col] = 1;
                }
            }
        }
        return mat;
    }
    public static int[][] bullsEye(){
        int[][] mat = new int[9][9];
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
}