package loopstatements;

public class Palindrome {

	public static void main(String args[]){  
		// It is number that remains same when its digit are reversed
		  int r;
		  int sum=0;
	      int temp;    
		  int n=252;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

