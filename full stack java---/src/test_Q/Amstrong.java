package test_Q;

public class Amstrong {
	
public int checkPower(int base, int expo) {
	int Power = 1;
	for(int i=1;i<=expo;i++) {
		 Power = Power * base;
	}
	return Power;	
	}

	public int  checkCount(int num) {
		
		int count = 0;
		while(num!=0) {
			num=num/10;
			count++;
	
		}return count;
	}
	public boolean isAmstrong(int num) {
		int count=checkCount(num);
		int temp=num;
		int sum=0;
		while(num!=0) {
			int base=num%10;
			sum = sum + checkPower(base, count);
		 num=num/10;
		}return sum==temp;
		
	}
	public static void main(String[] args) {
		Amstrong obj = new Amstrong();
		System.out.println(obj.isAmstrong(153)?"is Amstrong":"Not Amstrong");

	}

}
