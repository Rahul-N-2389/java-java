package test_Q;

public class PrimeNumber3 {
	public boolean  getPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			if(count>2) {
				return false;
	
			}
	}return true;
		}
	
	
	public static void main (String []args) {
		PrimeNumber3 obj =new PrimeNumber3();
		for(int i=1;i<=1000;i++){
			if(obj.getPrime(i)) {
				System.out.println(i);
				
			}
			
			
			
		}
	}
}
