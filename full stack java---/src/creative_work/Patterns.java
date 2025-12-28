package creative_work;

public class Patterns {
	public static void getPattern(int n) {
	
	for (int i=n;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
			
		}
		System.out.println();
	}
	}
	public static void main (String[]args) {
		getPattern(5);
		
	}

}
