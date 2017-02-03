import java.util.Scanner;

public class Board{
  
  static char[] row1 = {' ', ' ', ' '};
  static char[] row2 = {' ', ' ', ' '};
  static char[] row3 = {' ', ' ', ' '};
   
    //logic of the program
   public static void main(String[] args){
     
    System.out.println("enter x or o");
       
    Scanner input = new Scanner(System.in);
     
    char move = input.next().charAt(0); 
     
     System.out.println("Enter a row: ");
     
     int row = input.nextInt();
     
     System.out.println("Enter a column: ");
     
     int col = input.nextInt();
     
     if(row == 1){
       row1[col - 1] = move;
     }
     
     printBoard();
     
   }//end main
  
  //prints the board
  public static void printBoard(){
    
     System.out.println(" " + row1[0] + " | " +row1[1] + "  |  " +row1[2] + " ");
     System.out.println("____________");
     System.out.println("   |    |   ");
     System.out.println("____________");
     System.out.println("   |    |   "); 
  }//end of print board
  
}//end of class