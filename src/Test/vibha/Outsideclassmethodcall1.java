package Test.vibha;

public class Outsideclassmethodcall1 {
public void add(){
	System.out.println("Hi Ganesh");
}
	public static void main (String []args){
		Outsideclassmethodcall V= new Outsideclassmethodcall();
		V.demo1(); //object of 1st class followed by method 
		
		V.demo2();
		Outsideclassmethodcall.demo3(); //classname dot static method of first class in which we created
		Outsideclassmethodcall.demo4();
		Outsideclassmethodcall1 Z = new Outsideclassmethodcall1();
		Z.add();
	}
}
