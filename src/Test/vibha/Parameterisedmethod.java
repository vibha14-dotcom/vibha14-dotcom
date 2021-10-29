package Test.vibha;

public class Parameterisedmethod {
public void areaofsquare(){
	float side =10;
	float result= side*side;
	System.out.println("Area of square"+result);
}
public void areaofsquare(float side){
	float result= side*side;
	System.out.println("Area of square"+result);
}
public void areaofsquare(float side1,float side2){
	float result= side1*side2;
	System.out.println("Area of square"+result);
}
public static void main (String[] args){
	Parameterisedmethod C = new Parameterisedmethod();
	C.areaofsquare();
	C.areaofsquare(60);
	C.areaofsquare(25, 30);
}
}
