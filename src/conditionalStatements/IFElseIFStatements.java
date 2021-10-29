package conditionalStatements;

public class IFElseIFStatements {
//else if
//ElseifElse
	public static void main(String args[]){
		int marks = 54;
		if (marks>65){
			System.out.println("first class");
		}
		else if(marks>=60 && marks<65){
			System.out.println("First class hai");
		}
		else if(marks>=55 && marks<60){
			System.out.println("Higher Second Class hai");
		}
		else if(marks>=50 && marks<55){
			System.out.println("Second class hai");
			
		}
		if (marks>45){
			System.out.println("fail ho janab");
		}
	}
}
