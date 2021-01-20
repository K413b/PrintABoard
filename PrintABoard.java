  
/**
 * Make a program to make a board
 *
 * @author (Kaleb)
 * @version (1.12.21)
 */

import java.util.Scanner;

public class PrintABoard
{
   static void clearScreen()    {
       System.out.print('\u000C');
   }
   
   static String[][] buildBoard() {
       String[][] board = {{"0","0", "0", "0", "0"}, {"0","0", "0", "0", "0"}, {"0","0", "0", "0", "0"}, {"0","0", "0", "0", "0"}, {"0","0", "0", "0", "0"}};
       
       for (int a = 0; a < 5; a++) {    //Rows
           for (int b = 0; b < 5; b++)  {   //Columns
               board[a][b] = "0";
           }
       }
       
       return board;
   }
   
   static void printBoard(String[][] board)  {
       
       for (int a = 0; a < 5; a++) {
           for (int b = 0; b < 5; b++) {
               System.out.print("   " + board[a][b] + "     ");
            }
           System.out.println();
       }
       
   }
   
   static String[][] customizeBoard(String[][] board)   {
       int number = 5;
       int aCount = 0;
       int bCount = 0;
       Scanner key = new Scanner(System.in);
       
       //Prompt the user to input string for the array
            for (int a = 0; a < number; a++) {
                for (int b = 0;  b < number; b++) {
                    aCount = a + 1;
                    bCount = b + 1;
                    
                    System.out.print("I require a value for placement in string " + aCount + ", " + bCount + ":  ");
                    board[aCount][bCount] = key.next();
                }
            }
            return board;
   }
   
   static String[][] changeBoardElement(String[][] board, int x, int y)  {
       Scanner key = new Scanner(System.in);
       //Prompt the user to input strings for the array
       
            System.out.print("I require a value for placement in string " + x + ", " + y + ";   ");
            board[x][y] = key.next();
            
            return board;
   }
   
   public static void main(String[] args)    {
       //Initialize boobleans to allow repitition of tasks
       boolean playAgain = true;
       boolean fillAnElement = true;
       int x, y;
       
       //Initialize an array of length 5
       int number = 5;
       String[][] myBoard = {};
       
       //Create a variable for the user to choose a specific element
       int elementNumber;
       
       //Initialize scanner
       Scanner myScanner = new Scanner(System.in);
       
       //The tasks of the program that the user can repeat through the boolean playAgain
       do {
           clearScreen();
           
           System.out.println("A board requires usage.");
           
           myBoard = buildBoard();
           
           printBoard(myBoard);
           
           System.out.print("I require an x-coordinate. Change element  ");
           x = myScanner.nextInt();
           System.out.print("I require a y-coordinate. Change element  ");
           y = myScanner.nextInt();
           
           changeBoardElement(myBoard, x, y);
           
           printBoard(myBoard);
           
           System.out.print("Type true or false if you would like to play again.    ");
           playAgain = myScanner.nextBoolean();
       } while (playAgain); //Program loops while the user types yes, end when user types no
    }
}