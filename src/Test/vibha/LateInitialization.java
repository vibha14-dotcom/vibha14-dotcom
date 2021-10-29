package Test.vibha;
public class LateInitialization {
     String name;
     double fee;
     String training; //Instance variable , declaration
           
     public LateInitialization(String name1, double fee1,String training1)
    {  
    	 //local variable which in parameterised constructor
    	
    	 name= name1;
         fee = fee1 ;
         training =training1;
     }
     // Usage
     public void askcall(){
    	 System.out.println(name + "\n" + fee +"\n" +training);
     }
     public static void main(String []args){
    	 LateInitialization v =new LateInitialization("vibha",21000,"s/W testing");
           v.askcall();
           LateInitialization I =new LateInitialization("pari",21000,"java");
           I.askcall();
           LateInitialization B =new LateInitialization("Shona",21000,"s/W testing");
           B.askcall();
     }
} 
