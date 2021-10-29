package loopstatements;

public class InvertedrRightAngle {
public static void main (String[]args){
	int n = 5;
    //Outer Loop for number of Rows
    for(int i=1;i<=n;i++)
    {
        // printing '*' in each column.
        for(int j=n;j>=i;j--)
        {
          System.out.print("* ");
        }
        System.out.println();
    }
}
}

