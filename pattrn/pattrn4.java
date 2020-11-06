package pattrn;

public class pattrn4 {

	public static void main(String[] args) {
		int  p=0,py=0,y=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
			if(i%3==0) {
				if(i%5==0) {
				System.out.print("PINK&YELLOW ");
				py++;
				}
				else {
					System.out.print("PINK ");
					p++;
				}
				
			}
			else if(i%5==0) {
				System.out.print("YELLOW ");
				y++;
			}
		}
		System.out.println();
		System.out.println("pink "+p+" yellow "+y+" pink&yellow "+py);
	}

}
