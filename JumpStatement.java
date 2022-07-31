package Assignment1;

public class JumpStatement {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
		 if(i==5) {
			 System.out.println("Five");
			 continue;
		 }
		 System.out.println(i);
		}
	}

}
