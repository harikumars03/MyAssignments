package week1.day1;

public class Car {
  public void applyBreak() {
	  System.out.println("apply Break");
  }
  public void applyGear() {
	System.out.println("apply Gear");
  }
  public void applyAcclerate() {
	  System.out.println("apply Acclerate");
  }
   public static void main(String[] args) {
	  Car car=new Car();
	  car.applyBreak();
	  car.applyGear();
	  car.applyAcclerate();
			  
}
}
