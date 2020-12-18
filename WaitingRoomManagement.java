import java.util.Scanner;
public class WaitingRoomManagement {

  
    public static void main(String[] args) throws QueueOverflowException {
     
    Scanner sc=new Scanner(System.in);
    
    WRM ha=new WRM();
    for(;;){
     System.out.println("Please press 1 to Register Patient");
     System.out.println("Please press 2 to serve the patient");
     System.out.println("Please press 3 to cancel all the appointment");
     System.out.println("Please press 4 to check if doctor can go home or not");
     System.out.println("Please press 5 to show info of all patients");
     System.out.println("Please press 6 to cancel the program");
     int x=sc.nextInt();
     sc.nextLine();
     System.out.println();
     if(x==1){
     System.out.println("Enter patient name");
    
     String a=sc.nextLine();
     
   
     System.out.println("Enter patient id");
     int b=0; 
     try{
      b=sc.nextInt();
      }
        catch(Exception e){
       System.out.println("Please Sir Enter Patient Id");
     }
     sc.nextLine();
     System.out.println("Enter Blood Group");
     String c=sc.nextLine();
     
     
         try {    
             ha.RegisterPatient(a,b,c);
            
         } catch (QueueOverflowException ex) {
             throw new QueueOverflowException();
         }
     }
     if(x==2){
      ha.ServePatient();
     }
     if(x==3){
     ha.CancelAll();
     }
     if(x==4){
      ha.canHomego();
     }
     if(x==5){
     ha.ShowAllPatient();
     }
     if(x==6){
         break;
     }
     }
    
    }
    
}
