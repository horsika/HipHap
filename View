import java.io.*;
import java.util.*;

public class FileViewer {
   //create a File to list current folder contents
   File directory;
   //constructor
   public FileViewer(File directory){
      this.directory = directory;
   }
   
   private ArrayList<String> search(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Search by Event name, Date, or Project Manager!");
      CharSequence fileN = sc.nextLine();
      boolean matched = false;
      //ArrayList storing search results
      ArrayList<String> searchRes = new ArrayList<String>();
      
      int x = 0;
      for (File f : this.directory.listFiles())
      {
         boolean thisFileMatches = f.getName().contains(fileN);
         if (thisFileMatches)
         { 
            matched = true;
            System.out.println("["+ (++x) + "]" + " "+ f.getName()); //fileName instead of f.getName() CZEMU tak nie dziala
            searchRes.add(f.getName());
            System.out.println("File matched.");
         }     
      }
      if (!matched){
         System.out.println("File not matched.");
      }
      return searchRes;
   }
   private String openFile(ArrayList<String> searchRes){
      Scanner sc = new Scanner(System.in);
      System.out.println("Do you want to open a file? (y/n)");
      String openFile = sc.next();
      if (openFile.equals("y")){
         System.out.println("Which file do you want to open?");
         int number = sc.nextInt();
         //how to select the file??
         String fileName = searchRes.get(number-1);
         return fileName;
      }
      else if (openFile.equals("n")){
         System.out.println("you fucked up"); //go to menu?
         MenuM menu= new MenuM();
         menu.closeProgram();
         return null;
      }
      else{ 
         System.out.println("Invalid answer");
         return openFile(searchRes);
      }
   }
   private void readFile(String fileName){
      try {
        FileReader s = new FileReader( new File (fileName). getAbsolutePath());
        BufferedReader r = new BufferedReader(s);
        String line;
        while (true){
           line = r.readLine();
           if (line == null) 
              break;
           System.out.println(line);
        }
          r.close();
      }
      catch(Exception e){ 
         System.out.println("Error");
      }   
   }
   public void viewFile(){
     ArrayList<String> result = search();
     String name = openFile(result);
     readFile(name);
   }
}
