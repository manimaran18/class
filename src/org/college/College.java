package org.college;

public class College {
	private void collegeName() {
		// TODO Auto-generated method stub
		
System.out.println("College name is Anna University");
	}
	private void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("Code is 41697");

	}
	private void collegeRank() {
		// TODO Auto-generated method stub
		System.out.println("Ranking at 5");

	}
public static void main(String[] args) {
	College c = new College();
			c.collegeName();
	        c.collegeCode();
	        c.collegeRank();
    Dept v = new Dept();
    v.deptName();
    
    Hotel b = new Hotel();
    b.hotelName();
    Student x = new Student();
    x.studentName();
    x.studentId();
    x.studentDept();
    
    
}
}
