package loopstatements;

public class SquareOfStar {
	public static void main(String args[]) 
	  {
	      int n = 5;
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          // Inner loop for printing '*' in each column.
	          for(int j=0;j<n;j++)
	          {
	              // We add two spaces to match shape of a square.
	              System.out.print("*  ");
	          }
	          System.out.println();
	      }
	  }
	}
	
	
	
	

