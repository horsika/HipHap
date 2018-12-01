import java.util.*;
  
public class Event{
   Scanner sc = new Scanner(System.in);
   private String name = sc.nextLine();;
   private String location;
   private Date date;
   private String respEmp;
   private String clientN;
   private String techEl;
   private double cost;
   //setters
   public void setName(String name)
  {
     this.name =name;
  }
  public void setLocation(String location)
  {
      this.location = location;
  }
  public void setDate(Date date)
  {
     this.date = date;
  }
  public void setRespEmp(String respEmp)
  {
     this.respEmp =respEmp;
  }
  public void setClientN(String clientN)
  {
     this.clientN = clientN;
  }
  public void setTechEl(String techEl)
  {
     this.techEl =techEl;
  }
  public void setCost(double cost)
  {
     this.cost =cost;
  }
  //getters
  public String getName()
  {
      return name;
  }
  public String getLocation()
  {
      return location;
  }
  public Date getDate()
  {
      return date;
  }
  public String getRespEmp()
  {
      return respEmp;
  }
  public String getClientN()
  {
      return clientN;
  }
  public String getTechEl()
  {
      return techEl;
  }
  public double getcost()
  {
      return cost;
  }
  // constructor

  public Event(String name){
     this.name = name;
     this.location=location;
     this.date=date;
     this.respEmp=respEmp;
     this.clientN=clientN;
     this.techEl=techEl;
     this.cost=cost;
  }
  
  
   
}