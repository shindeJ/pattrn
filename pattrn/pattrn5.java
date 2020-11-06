package pattrn;

public class pattrn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
					if(j%2==1) {
						System.out.print("1");
					}
					else {
						System.out.print("0");
					}
				}
					else if(j%2==1) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2==1) {
					if(j%2==1) {
						System.out.print("1");
					}
					else {
						System.out.print("0");
					}
				}
					else if(j%2==1) {
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				
				
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					//if(j%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				/*}
				else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int n=2;n<=i;n++) {
				System.out.print(n);
			}
			
			System.out.println();
		}*/
		
	}

}
