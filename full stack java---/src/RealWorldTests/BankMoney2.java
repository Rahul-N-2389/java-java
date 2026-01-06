package RealWorldTests;
import java.util.Scanner;
public class BankMoney2 {
	
	public void getMoney(int Amount,int PIN) {
		
		int balance=100000;
		int MPIN=2211;
		
		
		if (Amount >= balance && MPIN == PIN) {
			
			System.out.print("not anough money");
		}else if (PIN!=MPIN) {
			System.out.print("enter Wrong PIN");
		}
		 else if (Amount<0) {
			System.out.println("invalid Enter Amount");
		
		
		}else if(Amount%100==1) {
			System.out.print("Enter details wrong");
	}
	}
	
	 
public static void main (String []args) {
	java.util.Scanner Give= new Scanner(System.in);
	BankMoney2 obj= new BankMoney2();
	System.out.print("Enter amount : ");
	int Amount = Give.nextInt();
	
	
	System.out.print("Enter Your PIN : ");
	int PIN=Give.nextInt();
	
	obj.getMoney(Amount, PIN);
}
	}
	
	
	
	
	
	
		
		
	
		
	