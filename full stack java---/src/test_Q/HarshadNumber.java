package test_Q;

public class HarshadNumber {
	public void isHarshadNum(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem = num%10;
			sum=rem+sum;
			num = num/10;
		}
		if(temp%sum==0) {
			System.out.println( temp +" : is harshad number");
		}
	}

	public static void main(String[] args) {
		HarshadNumber obj = new HarshadNumber();
		obj.isHarshadNum(24);
		

	} 

}
