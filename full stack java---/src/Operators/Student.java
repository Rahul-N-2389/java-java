package Operators;

public class Student {
	String name;
	int marks;

 
	public static void printDetails(Student s) {
		System.out.println("Student Name : "+s.name);
		System.out.println("Marks : "+ s.marks);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.name="Kalyan";
		obj.marks=85;
		printDetails(obj);
		
		

	}

}
