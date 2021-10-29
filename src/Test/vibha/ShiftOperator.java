package Test.vibha;

public class ShiftOperator {
	public static void main (String args[]){
		int s=20;
		System.out.println(s<<2); //s=20 2^2=4 20*4=80
		System.out.println(s<<3); // 2^3=8 20*8=160
		System.out.println(s<<4); //2^4=16 20*16=320
		System.out.println(s>>2);// 2^2=4 20/4=5
		System.out.println(s>>3); // 2^3=8 20/8=2
	    System.out.println(s>>>2);
	}

}
