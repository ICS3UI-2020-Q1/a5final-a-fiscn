import java.util.Scanner;

/**
 * program that will ask the user for the size of a line. It will then print to the screen the alternating text “black” and “white” the number of times that the user entered.
 * @authorNeil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in the length of the line 
      System.out.println("Please enter the length of the line:"); 
      
    //declare a variable for user input 
      int userNum = input.nextInt();
      
    //nest loop for line 
    for(int count = 1; count <= userNum; count++){
      if(count % 2 == 0)
        System.out.print("White, "); 
      else if(count % 2 > 0)          
        System.out.print("black, "); 
      }




    
  }
}
