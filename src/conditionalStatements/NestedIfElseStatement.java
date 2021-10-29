package conditionalStatements;

public class NestedIfElseStatement {
public static void main(String args[]){
	String username = "vibha1407";
	String passward =  "V@1407";
	if (username =="vibha1407"){
	 if (passward=="V@1407"){
		 System .out.println("user logged in");
	}
		else{
			System.out.println("you have entered invalid username ");
		}
	}
	 else {
		 System.out.println("you have entered invalid Passward");
	 }
	}
}

