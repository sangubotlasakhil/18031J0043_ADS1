import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Queuee {
	 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertFront(int item){
        //add element at the beginning of the queue
      //  System.out.println("adding at front: "+item);
        deque.add(0,item);
       // System.out.println(deque);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        //System.out.println("adding at rear: "+item);
        deque.add(item);
       // System.out.println(deque);
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
    
    public void removeatposition(int n)
    
    {
    	if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
    	int rem = deque.remove(n);
		if(Size()==0)
        System.out.print(rem);
		else
    	System.out.print(rem+" ");
    	
    }
}  

public class Solution
{
public static void main(String a[]) throws IOException{
     
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


	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());

	//System.out.println("n value is:"+n);
	//System.out.println(str[5]);
	
	for(int i=0;i<n;i++)
	{
		String str=br.readLine();
		String s[]=str.split(" ");
		int m=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		 int x=k;
		for(int j=0;j<m;j++)
		{
		deq.insertRear(j);
		}
		//System.out.println("deq size is"+deq.Size());
		int c=0,s1=0;
		while(c!=m)
		{
			if(k<=deq.Size())
			{
			deq.removeatposition(k-1);
			k=k+(x-1);
			c++;
			}
			
			//System.out.println("k value"+k);
			//System.out.println("size is"+deq.Size());
			else
			{
				k=k-deq.Size();
				if(k<deq.Size())
				{
					deq.removeatposition(k-1);
					k=k+(x-1);
					c++;
				}
			}
		
		}
		System.out.println();
	}
}
}
		