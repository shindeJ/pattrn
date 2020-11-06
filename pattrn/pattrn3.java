package pattrn;

public class pattrn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=3;i++) {
			for(int j=i;j<=3;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2;i>=1;i--) {
			for(int j=i;j<=3;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int s=4;
			System.out.println();
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int k=1;k<=s;k++) {
					System.out.print(" ");
				}
				for(int m=1;m<=i;m++) {
					System.out.print("*");
				}
				s=s-2;
				System.out.println();
			}
			System.out.println();
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=6-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
	}

}
