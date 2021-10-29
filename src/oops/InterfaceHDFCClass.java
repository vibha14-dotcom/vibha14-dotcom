package oops;

public class InterfaceHDFCClass implements Interface3, Interface2,Interface1
{
	public void start() {
		System.out.println(" It Is Started");
		
	}
	public void fullname() {
		System.out.println("Vibha Lahane");
		
	}
	public void panno() {
		System.out.println("AbJ555236");
		
	}
	public void mobno() {
	System.out.println("347485845798");
		
	}
	public void adharcard() {
		System.out.print("220256636563");
		
	}
	public void Withdraw() {
		System.out.println("6000");
		
	}
	

	
	public static void main(String[] args) {
		
		InterfaceHDFCClass z = new InterfaceHDFCClass();
		z.adharcard();
		z.fullname();
		z.mobno();
		z.panno();
		z.Withdraw();
		z.last();
		z.start();
	}
	
	
	
	public void last() {
		
		System.out.println("Thank u");
	}
	@Override
	public void adharno() {
		// TODO Auto-generated method stub
		
	}



	



	
	}


