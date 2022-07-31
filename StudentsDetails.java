package week2.day1;

public class StudentsDetails {
     
	
				
	public void printStudentName(String name) {
		System.out.println(name);
	}
	public void printStudentID(String ID) {
		System.out.println(ID);
	}
	public void printStudentAddress(String Address) {
		System.out.println(Address);
	}
	public static void main(String[] args) {
		StudentsDetails std=new StudentsDetails();
		std.printStudentName("Hari");
		std.printStudentID("101");
		std.printStudentAddress("Arani");
		std.printStudentName("Karthi");
		std.printStudentID("102");
		std.printStudentAddress("Cheyyar");
		std.printStudentName("Dinesh");
		std.printStudentID("103");
		std.printStudentAddress("Thachur");
		std.printStudentName("Suriya");
		std.printStudentID("104");
		std.printStudentAddress("Desur");
		
		
	}
	
}
