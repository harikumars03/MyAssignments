package week1.day1;

public class mobile {
	public void makeCall() {
		System.out.println("make call");
	}
     public void sendText() {
    	 System.out.println("send text");
     }
     public void browsingData() {
    	 System.out.println("browse website");
    	 
     }
     public static void main(String[] args) {
		mobile mob=new mobile();
		mob.makeCall();
		mob.browsingData();
		mob.sendText();
		
		
	}
}
