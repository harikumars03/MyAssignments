package week2.day1;

public class Employee {
	public void EmployeeName(String name) {
		System.out.println(name);
	}
	public void EmployeeID(String ID) {
		System.out.println(ID);
	}
	public void EmployeeAddress(String Address) {
		System.out.println(Address);
	}
	public void EmployeeMobile(String Mobile) {
		System.out.println(Mobile);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.EmployeeName("Name=Ram");
		emp.EmployeeID("1002");
		emp.EmployeeAddress("Chennai");
		emp.EmployeeMobile("7864697287");
		emp.EmployeeName("Name=Dhana");
		emp.EmployeeID("1003");
		emp.EmployeeAddress("Chennai");
		emp.EmployeeMobile("7862697298");
		emp.EmployeeName("Name=Koti");
		emp.EmployeeID("1004");
		emp.EmployeeAddress("Chennai");
		emp.EmployeeMobile("7864695434");
	}
}
