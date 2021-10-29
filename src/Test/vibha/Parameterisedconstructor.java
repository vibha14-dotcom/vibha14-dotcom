package Test.vibha;

public class Parameterisedconstructor {
	//declaration 
    String name;
	String bloodgroup;
	int height;

	// Constructor or Initialization
	public Parameterisedconstructor(){
		name = "Vibha";
		bloodgroup = "Ab+";
		height = 162;
		System.out.println("this is zero argument constructor");
		System.out.println(name);
		System.out.println(bloodgroup);
		System.out.println(height);
		
		
	}
	
	public Parameterisedconstructor(int a){
		name = "ganesh";
		bloodgroup = "O+";
		height = 165;
		System.out.println("this is single argument constructor");
	}
	public Parameterisedconstructor( int a,double b){
		name = "Sneha";
		bloodgroup = "O+";
		height = 172;
		System.out.println("this is double argument constructor");
	}
	public Parameterisedconstructor( int a,int b,long c){
		name = "Chaitali";
		bloodgroup = "A -ve";
		height = 150;
		System.out.println("this is Three argument constructor");
	}
	// Usage 
	public void bala(){
		System.out.println("name"+ "bloodgroup" +"height");
		
	}
	public static void main (String [] args){
		new Parameterisedconstructor(12);
		new Parameterisedconstructor(12,150);
		new Parameterisedconstructor(10,11,16);
		Parameterisedconstructor Y = new Parameterisedconstructor();
		Y.bala();
	}
}
