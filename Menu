import java.util.Scanner;
import java.io.*;


public class MenuM{      
   public void showMenu(){      
      System.out.println("=========WELCOME!=========");
      System.out.println("Please choose from the following! (Enter number only)");
      System.out.println(" [1] = Create new Event");
      System.out.println(" [2] = View existing Events");
      System.out.println(" [3] = Modify existing Events"); 

      Scanner sc = new Scanner(System.in);
      File dir = new File(".");
      FileViewer fileViewer = new FileViewer(dir);
      int m = sc.nextInt();
      if (m == 1){
         CreateM.createEvent();
      }
      if (m == 2){
         fileViewer.viewFile();
      }
      if (m == 3){
         System.out.println("Modify - not done yet."); 
      }
   }
   public void closeProgram(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Do you want proceed? (Sends to Menu) (y/n)");
      String openFile = sc.next();
      if (openFile.equals("y")){
         System.out.println("\n\n\n");  
         showMenu(); 
      }
      else if (openFile.equals("n")){
         //close program
         System.out.println("Good bye!");
      }
   }
}
