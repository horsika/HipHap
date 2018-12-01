import java.util.*;
import java.io.*;
 
public class CreateM{
   public static void createEvent(){
      //name the file                           //try     - one enormous exception try block
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the event!");
      String name = sc.nextLine();
      System.out.println("Enter the date of the event!");
      String date = sc.nextLine();
      System.out.println("Enter the name of the Project Manager!");
      String pM = sc.nextLine();
      
      String fileName = name + "_" + date + "_" + pM + ".txt";
      
      //create the file  
      File event = new File(fileName);
      try{ 
         event.createNewFile(); 
      }
      catch (Exception e) { 
         System.out.println("Error saving file."); 
      }   
      try {
         FileWriter fileW = new FileWriter(event);
         BufferedWriter buffW = new BufferedWriter(fileW);
         //buffW.append("Test");
         buffW.close();
      }
      catch (Exception e) { 
         System.out.println("Error saving file."); 
      }        
      //array containing event attributes in the file
      String[] eventAttr = new String[] {"Client", "Partners", "Type", "Time", "Location", // arraylist? if we have time with int
                                        "Employees", "Technical Stuff", "Dining", "Expenses"};
      // fill the array and save in a file
      for( int i = 0; i < eventAttr.length; i++){
         System.out.println("Insert " + eventAttr[i]);
         String input = sc.nextLine();
         try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("\n"+ eventAttr[i] + ": " + input);   
            writer.close();
         }
         //what does this do?
         catch (Exception e){ 
            System.out.println("Error saving file.");
         } 
      }  
      //catch
   }  
}
