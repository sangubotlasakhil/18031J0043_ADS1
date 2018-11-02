import java.util.*; 
  
class Solution { 
      
    public static void printTaxicab2(int N,int M) 
    { 
        // Starting from 1, check every number if 
        // it is Taxicab until count reaches N. 
        int i = 1, count = 0; 
        while (count < N)  
        { 
           int int_count = 0; 
           	
           // Try all possible pairs (j, k) whose   
           // cube sums can be i. 
           for (int j = 1; j <= Math.pow(i, 1.0/3); j++)  
              for (int k = j + 1; k <= Math.pow(i, 1.0/3); 
                                                   k++)  
                  if (j * j * j + k * k * k == i) 
                      int_count++; 
              
           // Taxicab(2) found 
           if (int_count == M)  
           { 
              count++; 
             // System.out.println(i);   
           } 
       
           i++; 
        } 
        System.out.println(i-1);
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String []s2=s1.split(" ");
        
        printTaxicab2(Integer.parseInt(s2[0]),Integer.parseInt(s2[1])); 
        
          
    } 
} 
    
// This code is contributed by Arnav Kr. Mandal. 