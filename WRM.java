public class WRM extends ArrayQueue{

 
 
 public WRM(){
 
 }
   
    
    public void RegisterPatient(String x, int y,String z)throws QueueOverflowException{
     
           enqueue(x,y,z);
           
       }
       
       

    
    public void ServePatient() {
    
      
     if(size()==0){
       
      System.out.println("AlhamdulilAllah Nobody is Sick :)");
      System.out.println();
     }
     else{
       Patient x;
       try{
       x=dequeue();
       System.out.println();
       System.out.println("Serving patient");
       System.out.println("****Serving patient Info****");
       System.out.println("Patient Name "+x.name);
       System.out.println("Patient ID "+x.id);
       System.out.println("Patient BloodGroup "+x.bloodgroup);
       System.out.println();
       }
       catch(Exception e){
        System.out.println("We have served All the patient");
       }
     }
    }
    
    
       
       public void ShowAllPatient(){
         int s=size(); 
         if(s==0){
          System.out.println("AlhamdulilAllah Nobody is Sick :)"); 
          System.out.println();
         }
         else{
           int x=start; // circular array hoileo start value starting e 0 so problem hoi nai.
       
        //   System.out.println(s);
           while(x<data.length){
             if(data[x].name.equals(null)  && data[x].bloodgroup.equals(null)){
               x=(x+1)%data.length;
             }
             else{
               s=s-1;
               System.out.println("PATIENT INFO");
               System.out.println("Patient Name "+data[x].name);
               System.out.println("Patient ID "+data[x].id);
               System.out.println("Patient BloodGroup "+data[x].bloodgroup);
               System.out.println();
               x=(x+1)%data.length;
               if(s==0){
                 System.out.println("Break");
                 break;
               }
             }
             
           }
         }
           }
       

       public void CancelAll(){
         System.out.println("size"+size());
         if(size()==0){
           System.out.println("No Patient Available Now");
         }
         else{
          
           int i=start;
           
           while(i<data.length){
             
             data[i]=null;
             i=(i+1)%data.length;
             if(size()==0){
               break;
             }
           }
           System.out.println("Sorry All Schedule for Today Has Been Cancelled");
         }
     
        }
       


       
      public void canHomego(){
       boolean flag=isEmpty();
       if(flag==true){
         System.out.println("Yes They Can GO!!!!!");
       }
       else{
       System.out.println("NO They have got big responsibility to do");
       }
      }
  
}


   


