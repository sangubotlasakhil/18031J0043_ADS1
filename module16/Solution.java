
import java.util.Scanner;
 class Book  {
	String name;
	String author;
	double price;
	
	Book(String name,String author,double price)
	{
		this.author=author;
		this.name=name;
		this.price=price;
	}
	
}
class Node
{
	Book key;
	int value;
	Node left,right;
	Node(Book key,int value)
	{
		this.key=key;
		this.value=value;
	}
	
}
class BinarySearchTree
{
	Node root;
BinarySearchTree()
{
	root=null;
}
public void display()
{
	Node n=root;
	while(n!=null)
	{
		System.out.println(n.value);
		n=n.right;
	}
	
}
public void put(Book Key,int value)
{
	root=put(root,Key,value);
}
private Node put (Node x, Book key, int value)
{
	if(x==null)
	{
		return new Node(key,value);
	}
	if(key.name.compareTo(x.key.name)<0)
	{
		x.left=put(x.left,key,value);
	}
	else if(key.name.compareTo(x.key.name)>0)
	{
		x.right=put(x.right,key,value);
	}
	else
	{
		x.value=value;
	}
	return x;
}
public int get(Node x, Book key) { 
if (x == null) {
	
	return 0;}
int cmp =compare(key,x.key) ;  
if (cmp < 0) 
return get(x.left, key);     
else if (cmp > 0) 
return get(x.right, key);   
else return x.value; 
}


public int compare(Book a,Book b)
{
	if(a.name.compareTo(b.name)>0)
{
	return 1;
			
}
	else if(a.name.compareTo(b.name)<0)
	{
		return -1;
	}
	else
	{
		return 0;
	}

}


}

public class Solution {
public static void main(String arg[])
{BinarySearchTree bst=new BinarySearchTree();
	Scanner sc= new Scanner(System.in);
	while(sc.hasNext())
	{
		String str = sc.nextLine();
		String st[] = str.split(",");
		switch(st[0])
		{
			case "put":
			{
				Book b = new Book(st[1],st[2],Double.parseDouble(st[3]));
				int va=Integer.parseInt(st[4]);
				
				bst.put(b, va);
				break;
			}
			case "get":
			{
				Book b = new Book(st[1],st[2],Double.parseDouble(st[3]));
				int k=bst.get(bst.root,b);
				if(k==0)
				{
					System.out.println("null");
					
				}
				else
				{
					System.out.println(k);
				}
				
				
				break;
			}
		}
		
	}
	
	

}
}
