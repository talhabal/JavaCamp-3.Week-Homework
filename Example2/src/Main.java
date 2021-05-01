
public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(); 
		instructor.setCourseName("JAVA");
		instructor.setLastName("Demiroð");
		instructor.setFirstName("Engin");
		instructor.setStudentNumber(1505);
		instructor.setInstructorNumber(1909);
		instructorManager.addCourse(instructor);
		instructorManager.addStudent(instructor);
		
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student();
		student.setFirstName("Ahmet Temiz");
		student.setCourseName("PHP");
		studentManager.applicationCourse(student);
		
		
		
		

	}

}
