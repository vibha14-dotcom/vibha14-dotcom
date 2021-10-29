package loopstatements;
import java.util.Scanner;  
public class AverageOfSix {
	 
	   public static void main(String[] args)  
	    {  
	      int n;
	      int count = 1;   
	      float  Z;
	      float averageF;
	      float sumF = 0;   
	      Scanner sc = new Scanner(System.in);     
	      System.out.println("Enter the value of n");  
	      n = sc.nextInt();  
	      while (count <= n)   
	             {   
	                  System.out.println("Enter the "+count+" number?");  
	                  Z = sc.nextInt();  
	                  sumF += Z;   
	                  ++count;   
	             }   
	                  averageF = sumF/n;   
	                  sc.close();
	        System.out.println("The Average is"+averageF);  
	    }    
	}  

