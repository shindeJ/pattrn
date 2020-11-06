package pattrn;

public class pattrn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		
		  for(int i=1;i<=7;i++) { System.out.print(ch); ch++; } ch--; ch--; for(int
		  i=0;i<6;i++) { System.out.print(ch); ch--; } System.out.println();
		 
		int n=6;
		int s=1;
		for(int i=1;i<=6;i++) {
			ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch);
				ch++;
			}
			////if(n==7)
			//	ch--;
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			ch--;
			//ch--;
			for(int j=1;j<=n;j++) {
				System.out.print(ch);
				ch--;
			}
			
			
			
			
			s=s+2;
			n--;
			System.out.println();
		}

	}

}
