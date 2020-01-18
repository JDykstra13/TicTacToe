import java.util.*;
public class Question7_8
{

    public static void main(String[] args){
        int[][] mat = new int[7][5];
        int[] ans= new int[mat.length]; 

        for(int r = 0; r < mat.length; r++){
            int count = 0;
            for(int c = 0; c < mat[0].length; c++){

                count += mat[r][c];

            }
            ans[r] = count;
        }
        System.out.println(ans);
    }

}
