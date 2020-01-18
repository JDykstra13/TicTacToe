import java.util.*;
public class TicTacToe
{
    public static void main(String[] args)
    {
        playGame();
    }

    public static String[][] board;

    public static void playGame(){
        int turn = 0; 
        setUpBoard();
        while(!isWon() && turn < 9){
            printBoard();
            if(turn % 2 == 0){
                System.out.println("X players turn");
            }
            else{
                System.out.println("O players turn");
            }
            updateBoard(turn);
            turn++;
        }
        printBoard();
        if(turn == 9 && !isWon()){
            System.out.println("Game is a draw");
        }
        else if(turn % 2 == 0){
            System.out.println("O-player wins!");
        }
        else{
            System.out.println("X- player wins!");
        }
    }

    public static boolean isLegal(int row, int col)
    {
        if(row <= board.length && col <= board[0].length){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(int row, int col)
    {
        return board[row][col].equals(" ");
    }

    public static boolean isWon()
    {

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(col == row && board[row][col].equals("x")){ //column
                    return true;
                }
                if(col == row && board[row][col].equals("o")){
                    return true;
                }
                for(int i = 0; i < board[0].length; i++){
                    if(col == i && board[row][col].equals("x")){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void printBoard()
    {
        System.out.println();
        for(String[] row: board)
            System.out.println(Arrays.toString(row));
        System.out.println();
    }

    public static void setUpBoard()
    {
        board = new String[5][5];
        for(int row = 0; row < board.length; row++)
            for(int col = 0; col < board[0].length; col++)
                board[row][col] = " ";
    }

    public static void updateBoard(int turn)
    {
        Scanner scan = new Scanner(System.in); //object whos purpose is to take in user input

        System.out.println("Please enter a row");
        int tempRow = scan.nextInt();//waits for user to input next int
        System.out.println("Please enter a column");
        int tempCol = scan.nextInt();

        while(!isLegal(tempRow, tempCol))
        {
            System.out.println("That square is not available.\nPlease choose again.");
            printBoard();
            System.out.println("Please enter a row");
            tempRow = scan.nextInt();
            System.out.println("Please enter a column");
            tempCol = scan.nextInt();
        }

        String letter;
        if(turn % 2 == 0)
            letter = "X";
        else
            letter = "O";

        board[tempRow][tempCol] = letter;
    }

}