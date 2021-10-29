package Test.vibha;

public class Thisprogram {
// declaration 
	int a = 3000; // Instance variable
	int b = 4000;
	public void callvariable(){
		int a = 80; // Local Variable
		int b= 90;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(this.a);
		 System.out.println(this.b);
		 
	}
	public void callvariable2(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	public static void main (String [] args){
		Thisprogram t = new Thisprogram();
		t.callvariable();
		t.callvariable2(12,13);
		
	}
}
