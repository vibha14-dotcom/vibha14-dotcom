package Test.vibha;

public class Useconstructor{
	//declaration 
	int X;// Instance variable
	int Y;
	
	
	//Intialization or constructor or 
	// we have not used constructor here directly initialised variable value in method

public void add(){
	int X= 20;
	int Y=40;
	int z= X+Y;
	System.out.println(z);
	
}
public void Multiply(){
	int X= 50;
	int Y= 30;
	int z = X*Y;
	System.out.println(z);
}
public void substraction(){
	int X= 500;
	int Y= 200;
	int z = X-Y;
	System.out.println(z);
		
}
public static void main (String []args){
	Useconstructor B = new Useconstructor();
	B.add();
	B.Multiply();
	B.substraction();
	
	
	
	
	
}
}