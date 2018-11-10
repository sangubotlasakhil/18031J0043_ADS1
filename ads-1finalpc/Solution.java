import java.util.ArrayList;
import java.util.*;
 class HashNode<value,key,marks>
{
    key k;
    value v;
    marks m;
    HashNode<value,key,marks> next;
    public HashNode(value v,key k,marks m)
    {
    	this.k=k;
    	this.v=v;
    	this.m=m;
    }

}
class HashTable<value,key,marks>
{
     ArrayList<HashNode<value,key,marks>>obj=new ArrayList<>();
     private int numBuckets;
     private int size;
     
     public HashTable()
     {
    	 numBuckets=1000;
    	 size=0;
    	 for(int i=0;i<numBuckets;i++)
    	 {
    		 obj.add(null);
    	 }
    	 
     }
     public int getSize()
     {
    	 return size;
     }
     public boolean isEmpty()
     {
    	 return size==0;
     }
     private int getBucketIndex(key k)
     {
    	 int hashcode=k.hashCode();
    	 int index=hashcode%numBuckets;
    	 return index;
     }
     
     public value get(key k)
     {
    	 int BucketIndex=getBucketIndex(k);
    	 
    	 HashNode<value,key,marks> head=obj.get(BucketIndex);
    	 
    	 while(head!=null)
    	 {
    		 if(head.k.equals(k))
    		 {
    			 return head.v;
    		 }
    		 head=head.next;
    	 }
    	 return null;
     }
     public void add(value v,key k,marks m)
     {
         int BucketIndex=getBucketIndex(k);
    	 
    	 HashNode<value,key,marks> head=obj.get(BucketIndex);
    	 
    	 while(head!=null)
    	 {
    		 if (head.k.equals(k)) 
             { 
                 head.v = v; 
                 return; 
             } 
             head = head.next; 
    	 }
    	 size++;
    	 
    	 head=obj.get(BucketIndex);
    	 
    	 HashNode<value,key,marks> obj1=new HashNode<value,key,marks>(v,k,m);
    	 obj1.next=head;
    	 obj.set(BucketIndex, obj1);
    	 
     }
     
     
     
     
    /* public static void main(String args[])
     {
    	 HashTable<String,Integer,Double> object=new HashTable<>();
    	 
    	 object.add("goutham",777,1233.00);
    	 object.add("akhil",8143,234.43);
    	 System.out.println(object.size);
    	 System.out.println(object.isEmpty());
    	System.out.println(object.get(8143)); 
    	System.out.println(object.get(777));
		*/
	
}

public class Solution
{
		public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		HashTable<Integer,String,Double> object=new HashTable<>();
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			String st []=str.split(",");
			//ss=new Student(Integer.parseInt(st[0]),st[1],Double.parseDouble(st[2]));
			object.add(Integer.parseInt(st[0]), st[1],Double.parseDouble(st[2]));
			System.out.println(object.get(st[1]));
		}
		
		
		
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			String str=sc.next();
			String st[]=str.split(" ");
			 //System.out.println(st[0]);
			object.get(st[1]);
		}
		
	}


}