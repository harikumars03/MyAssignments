package Org.system;

public class Students extends College {
	
	public void StudentsName() {
		System.out.println("StudentsName");
		
	}
	public void StudentsId() {
		System.out.println("StudentsId");
		
	}
	public void StudentsDep() {
		System.out.println("StudentsDep");
		
	}
	
	public static void main(String[] args) {
		Students stud=new Students();
		stud.CollegeId();
		stud.CollegeName();
		stud.CollegeRank();
		stud.StudentsName();
		stud.StudentsDep();
		stud.StudentsId();
		
		
	}

}
