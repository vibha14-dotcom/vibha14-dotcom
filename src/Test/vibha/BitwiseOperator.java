package Test.vibha;

public class BitwiseOperator {
	public static void main (String args[]){
		//&& This Is logical And
		// & Bitwise and
		int a= 400;
		int b= 200;
		int c= 300;
		int d = 500;
		System.out.println(a>b && d>c); //true && true
		System.out.println(c<d && d>a); // true && true
		System.out.println(a>c && c!=a); // 
		System.out.println(a<c && c>d); //false && False
		System.out.println(a==b && d<a);// false
		System.out.println(a>b & d>c); //true & true
	}

}
