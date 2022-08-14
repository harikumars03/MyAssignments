package Org.system;

public class StudentsInfo {
	public void getStudentInfo(int Id) {
		System.out.println(Id);
	}
	public void getStudentInfo(String Name) {
		System.out.println(Name);
	}
	public void getStudentInfo(int Id,String email) {
		System.out.println(Id+"  "+email);
	}
	public void getStudentInfo(Long Id) {
		System.out.println(Id);
	}
	public static void main(String[] args) {
		StudentsInfo s=new StudentsInfo();
		s.getStudentInfo(303);
	   s.getStudentInfo("Hari");
	   s.getStudentInfo("303, haris12@gmail.com");
	   s.getStudentInfo(873793009);
	}


}
