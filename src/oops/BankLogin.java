package oops;

public class BankLogin {
public void username(){
	System.out.println("enter username");
}
public void password(){
	System.out.println("Enter Password");

}
public void login(){
	System.out.println("Login successful");
}
public static void main (String args[]){
	BankMoneyTransfer S =new BankMoneyTransfer();
	S.Quick();
	S.RTGS();
	BankMoneyChecking Z =new BankMoneyChecking();
      Z.passbook();
     
	Z.Ministatement();
	BankLogin Y =new BankLogin();
	Y.password();
	Y.password();
	
}
}
