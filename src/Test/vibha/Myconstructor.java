package Test.vibha;

public class Myconstructor {
	//declaration
	int x; // Instance variable
	int y;

public Myconstructor(){
	//Initialization or Constructor
	x= 2000;
	y= 1000;
}
//Usage
	public void add(){
		int z = x+y;
		System.out.println(z);
		
	}
	public static void main (String [] args){
		//new Myconstructor();
		 Myconstructor x = new Myconstructor();
		x.add();
		
	}
}	


