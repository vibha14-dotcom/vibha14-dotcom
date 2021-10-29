package loopstatements;

public class MirrorLowerStar {
	// Method
    // Main driver method
    public static void main(String[] args)
    {
        // Declare and initialize variable to
        // Size of the triangle
        
  
        // Declaring two variables for rows and columns
        int i, j;
  
        // Outer loop 1
        // Prints the first half triangle
        for (i = 1; i<= 5; i++) {
  
            // Inner loop 1
           for (j = 1; j <= i; j++) {
                // Print whitespace
                System.out.print(" *");
                
           }
           System.out.println();
            }
        star();
        }
    public static void star(){
   int t=6;
		for(int i=1;i<=t;i++)
		{
			for(int j=t;j>=i;j--)
			{
				System.out.println("*"); 
			}
			System.out.println("");
			
		}
		
    }
   

}


