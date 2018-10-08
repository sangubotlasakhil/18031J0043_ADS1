import java.util.Scanner;
class Node1 
{
	int data;
	Node1 next;
	  public Node1(int a)
	 {
		 data=a;
		 next=null;
	 }  

}
 class 	LinkedList1
 {
	 Node1 head;
	
	
 	
 
 	public void pushend(int a)
 	{
 		Node1 n=new Node1(a);
 	
 		if(head==null)
 		{
 			head=n;
 		}
 		else
 		{	Node1 temp =head;
 		while(temp.next!=null)
 		{
 			temp=temp.next;
 		}
 		
 		temp.next=n;
 		}
 		
 	}
 	public int  popend()
	{
 		Node1 temp1=null;
		
		if(head==null)
			
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else if(head.next==null)
		{Node1 temp=head;
		head=null;
			return temp.data;
		}
		else
		{
			Node1 temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp1=temp.next;
		temp.next=null;
		return temp1.data;
		}
		

	}
	
	public void disply()
	{	
		Node1 temp=head;
		if(head==null)
		{
			System.out.println("there are no elements to display");
		}
		else
		{
		while(temp!=null)
		{
			
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		}
	}
	public void pushf(int a)
	{

 		Node1 n=new Node1(a);
 	
 		if(head==null)
 		{
 			head=n;
 		}
 		else
 		{	head.next=head;
 		    head=n;
 		}
 		
	}
	public int popf()
	{
 	
 		if(head==null)
 		{
 			return -1;
 		}
 		else
 		{	Node1 temp1=head;
 		head=head.next;
 		   return temp1.data;
 		}
 		
	}
	public int size()
	{Node1 temp1=head;
	int count=0;
	while(temp1!=null)
	{
		temp1=temp1.next;
		count++;
		
	}
	return count;
		
	}
	public String toString() {
		return head.data+""+head.next;
	}
	
 }

class AddLargeNumbers {
    int count1=0;
    public static LinkedList1 numberToDigits(String number) {
    	
    	LinkedList1 l=new LinkedList1();
    	if(number.length()<9)
    	{
    	int n=Integer.parseInt(number);
    	l.pushf(n);
		return l;
    	}
    	else
    	{ 
    		char ch[]=number.toCharArray();
    		for(int i = 0;i<ch.length;i++)
    		{int m=ch[i]-48;
    			l.pushf(m);
    		}
    		return l;
    	}

    }

    public static String digitsToNumber(LinkedList1 list) {
    	
    	String s1=list.toString();
	return s1;
    }

    public static LinkedList1 addLargeNumbers(LinkedList1 list1, LinkedList1 list2) {
    	LinkedList1 l1=new LinkedList1();
    	if(list1.size()<9 && list2.size()<9)
    	{
    	int no=list1.popend()+list2.popend();
    	// System.out.println("no:"+no);
    	l1.pushf(no);
		return l1;
    	}
    	else
    	{int c1=0,no,n1 = 0,n2,n3 = 0;
    		int i;
			if(list1.size()>list2.size())
    		{
    			for(i=0;i<list2.size();i++)
    			{
    			n1=list1.popend();n2=list2.popend();
    			if(n1 >=5 || n2>=5)
    			{
    				no=n1+n2+n3;
    				l1.pushf(no);
    				if(n1>n2)
    				{
    					n3=no/n1;
    				}
    				else
    				{
    					n3=no/n2;
    				}
    			
    			}
    			else
    			{
    			no=n1+n2+n3;
    			l1.pushf(no);
    			}
    			}
    			no=n1;
    			l1.pushf(no);
    			return l1;
    		}
    		else
    		{
    			for(i=0;i<list1.size();i++)
    			{
    			n1=list1.popend();n2=list2.popend();
    			if(n1 >=5 || n2>=5)
    			{
    				no=n1+n2+n3;
    				l1.pushf(no);
    				if(n1>n2)
    				{
    					n3=no/n1;
    				}
    				else
    				{
    					n3=no/n2;
    				}
    			
    			}
    			else
    			{
    			no=n1+n2+n3;
    			l1.pushf(no);
    			}
    			}
    			no=n1;
    			l1.pushf(no);
    			return l1;
    			
    			
    		}
    		
    	}

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList1 pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList1 qDigits = AddLargeNumbers.numberToDigits(q);  
               System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
               System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
            	LinkedList1 pDigits1 = AddLargeNumbers.numberToDigits(p);
            	LinkedList1 qDigits1 = AddLargeNumbers.numberToDigits(q);
            	// System.out.println(pDigits1 +" "+qDigits1);
            	LinkedList1 result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
