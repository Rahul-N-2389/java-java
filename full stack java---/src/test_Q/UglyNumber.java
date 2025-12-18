package test_Q;

public class UglyNumber {
	public boolean checkUgly(int num) {
		
		
		while(num>0) {
			
			if(num%2==0) {
				num=num/2;
			}else if (num%3==0) {
				num=num/3;
			}else if (num%5==0) {
				num=num/5;
			}else {
				break;
			}
			
		}return num==1;
	}

	public static void main(String[] args) {
		UglyNumber obj = new UglyNumber();
		for(int i=1;i<=50;i++) {
			if(obj.checkUgly(i)) {
				System.out.print(i+" ");
			}
			
			
		}
		
		

	}

}
