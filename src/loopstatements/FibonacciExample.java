package loopstatements;

public class FibonacciExample {
	// we want output like 0 1 1 2 3 5 8.....so on
	public static void main (String args[]){
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.println(n1+""+n2); //printing 0 and 1
		for (int i=2;i<count;++i){ // loops start from 2 bcz 0 and 1 are already printed
			n3= n1+n2;
			System.out.println(""+ n3);
			n1=n2;
			n2=n3;
					
		}
	}

}
