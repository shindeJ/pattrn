package pattrn;

public class pattrn1 {

	public static  void main(String[] args) {
		//System.out.println("hi");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2==1)
					{if(j%2==1)
						System.out.print("1");
					else
						System.out.print("0");}
				else if(j%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
