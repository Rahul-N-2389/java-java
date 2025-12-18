package test_Q;

public class NeonNum {
	public void getNeon(int num) {
		int sum=0;
		int temp = num;
		int Sqare = num*num;
		while(Sqare!=0) {
			int rem = Sqare%10;
			sum= sum+rem;
			Sqare = Sqare/10;
//			System.out.println(sum);
//			System.out.println(num);
		}
		if(sum==temp) {
			System.out.println(num + " : Neon");
			
		}else {
			System.out.println(num + " : not Neon");
		}
		
	}
	public static void main (String[]args) {
		new NeonNum().getNeon(9);
	}

}
