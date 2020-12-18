public class ArrayQueue implements Queue{
    int size;
    int start;
    int front;
    int rear;
    Patient [] data;
    
    public ArrayQueue(){
        start=0;
        size =0;
        rear =-1;
        front =-1;
        data = new Patient[5];
    }
    
    public int size(){
        
        return size;
    }
    
    public boolean isEmpty(){
       if(size==0){
           return true;
       }
       else{
           return false;
       }
    }
    
    public void enqueue(String x, int y, String z) throws QueueOverflowException{
    
        if(size==0){
          
            front=(front+1+start)%data.length;
            rear=(rear+start+1)%data.length;
            data[rear]=new Patient(x,y,z);
            size=1;
            System.out.println("CAPACITY"+ size()+" First patient Enrolled");
        }
        
       else if(size>0 && size<data.length){
            
//            front=(front+1)%data.length;
            rear=(rear+1)%data.length;
            data[rear]=new Patient(x,y,z);
            size=size+1;
            System.out.println("CAPACITY"+ size());
        }
        
        else{
            throw new  QueueOverflowException();
        }
    
    }
    
    public Patient dequeue() throws QueueUnderflowException{
        Patient p=null;
        
        if(size>0){
            p=data[front];
            data[front]=null;
            front=(front+1)%data.length;
            size--;
        }
        else{
            throw new QueueUnderflowException();
        }
        return p;
        
    }
    
    public Object peek() throws QueueUnderflowException{
        Object x=null;
        if(size>0){
            x=data[rear];
        }
        else{
            throw new QueueUnderflowException();
        }
        return x;
    }
  
  public void en(){
      
    }


}