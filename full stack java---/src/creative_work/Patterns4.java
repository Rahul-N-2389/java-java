package creative_work;

public class Patterns4 {
	public static void getPattern(int n) {
	
	for (int i=1;i<n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(" *");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.println(" ");
		}
		System.out.println();
	}
	}
	public static void main (String[]args) {
		getPattern(5);
		
	}

}
