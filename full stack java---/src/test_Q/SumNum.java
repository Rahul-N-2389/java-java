package test_Q;

public class SumNum {
	
	public void getAdd(int num) {
		
		int add=0;
		while(num !=0) {
			int sum = num%10;
			add=add+sum;
			num /= 10;
		}
		System.out.println(add);
	}

	public static void main(String[] args) {
		SumNum obj =new SumNum();
		obj.getAdd(23444);
		
				

	}

}
