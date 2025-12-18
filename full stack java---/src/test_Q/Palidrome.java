package test_Q;

public class Palidrome {
	public void getPalidrome(int num) {
		int addNum=0;
		int temp=num;
		while(num>0) {
			int rem= num%10;
			addNum = addNum*10 + rem;
			num = num/10;
			
		}
		if(addNum==temp) {
			System.out.println(addNum + " : Palidrome");
		}else {
			System.out.println(addNum + " : not Palidrome");
		}
		
	}

	public static void main(String[] args) {
		new Palidrome().getPalidrome(484);
		

	}

}
