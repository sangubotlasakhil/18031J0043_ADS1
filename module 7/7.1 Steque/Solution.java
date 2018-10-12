import java.io.*;
import java.util.*;
class Node 
{
	int data;
	Node next;
	  public Node(int a)
	 {
		 data=a;
		 next=null;
	 }
	  
	  

}

class LList
{
	Node head;
	
	public LList() 
	{
		
		head=null;
	}
	public void pushend(int a)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			
		
		Node temp =head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=n;
		}
	}
	public void pushfront(int a)
	{
		Node n=new Node(a);
		//Node temp=head;
		if(head==null)
		{
			head=n;
		}
		else
		{
		n.next=head;
		head=n;
		}
					
	}
	
	
	
	public int popatfront()
	{
		Node temp=head;
		Node sec=null;
		if(head==null)
		{
			//System.out.println("Steque is empty.");
			return 0;
			
		}
		else
			{
			
			if(head.next==null)
			{
				int ele1=head.data;
				head=null;
				return ele1;
			}
		
			 int ele=head.data;
			 head=head.next;
			return ele;
		 
			}
		
		
	}
	
	
	public void disply()
	{	
		Node temp=head;
		if(temp==null)
		{
			System.out.print("Steque is empty\n");
			
		}
		while(temp!=null)
		
		{	
			
			if(temp==head)
			{
				System.out.print(temp.data);
			}
			else 
			System.out.print(", "+temp.data);
		
			temp=temp.next;
		}
	}
	
	public void disply1()
	{
		Node temp=head;
		while(temp!=null)
		{	System.out.println(temp.data+" ");
		
			temp=temp.next;
		}
	}
	public int size()
	{	int count=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count=count+1;
			
		}
		//System.out.println(count);
		return count;
	}
	
	
}

public class Solution
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		Scanner sc=new Scanner(System.in);
		LList ll=new LList();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			String str;//=br.readLine();
			while((str=br.readLine())!=null)
			{
			
			String s[]=str.split(" ");
			
			switch(s[0])
			{
			case "push" : ll.pushfront((Integer.parseInt(s[1])));
							ll.disply();
								break;
								
			case "pop":	int k=ll.popatfront();	
						
						ll.disply();
								
								break;
			case "enqueue":ll.pushend((Integer.parseInt(s[1])));
							ll.disply();
							break;
							
			
			default :
						break;			
			
			
				
			}
			System.out.println();
			
			
		}
		}
		
		
	}
}