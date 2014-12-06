package student.java;

public class StudentInfo extends OneStudent{//f

	@Override
	public int studentId() {
		System.out.println("");// TODO Auto-generated method stub
		return 0;
		
	}
	
	@Override
	public String studentName() {
		System.out.println("Syeda Ummezahra");
		return null;
	}

	@Override
	public void assignSection() {
		System.out.println("CET");
	}

	@Override
	public void studentDOB() {
		System.out.println("1991");
		
	}

	@Override
	public void studentGPA() {
		System.out.println("3.5");
		
	}

	@Override
	public void studentSOS() {
		System.out.println("135468789");
		
	}
	
 /*This class can be implemented from Student interface then add additional methods in StudentInfo class.
 * Also, Student interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into StudentInfo class.Once you done with designing StudentInfo class, g
 * go to UniversityStudent class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts
 * in every level possible.
 */

}
