
import java.io.*;
import java.util.*;
 class Queuee {
	 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertFront(int item){
        //add element at the beginning of the queue
      //  System.out.println("adding at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        //System.out.println("adding at rear: "+item);
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(0);
        //System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(deque.size()-1);
      //  System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public int peakFront(){
        //gets the element from the front without removing it
        int item = deque.get(0);
        //System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakRear(){
        //gets the element from the rear without removing it
        int item = deque.get(deque.size()-1);
       // System.out.println("Element at rear: "+item);
        return item;
    }
    
    public int Size()
    {
    	return deque.size();
    }
}  
   

public class Solution
{
public static void main(String a[]){
     
    Queuee deq = new Queuee();
  /*  deq.insertFront(34);
    deq.insertRear(45);
    deq.removeFront();
    deq.removeFront();
    deq.removeFront();
    deq.insertFront(21);
    deq.insertFront(98);
    deq.insertRear(5);
    deq.insertFront(43);
    deq.removeRear();*/


	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

	int i;
	String str[]=new String [n];
	for( i=0;sc.hasNext();i++)
	{
		str[i]=sc.nextLine();
		
		
	}
	//System.out.println(str[5]);
	String a1[]=new String[1];
	for( i=0;i<n;i++)
	{
		a1=str[i].split(" ");
		
		switch(a1[0])
		{
		case "pushLeft" : deq.insertFront(Integer.parseInt(a1[1]));
							break;
							
		case "pushRight":deq.insertRear(Integer.parseInt(a1[1]));	
							
							break;
		case "popRight":deq.removeRear();
						break;
		case "popLeft" :deq.removeFront();
						break;
		case "size":System.out.println(deq.Size());
					break;
		default :
					break;			
		
		
			
		}
		
	}
	
	
	
}
}

