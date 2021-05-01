
public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaralý eðitmen "+instructor.getFirstName()+" "
				+instructor.getLastName()+" "+instructor.getCourseName()+" adýnda bir kurs ekledi!");
		
	}
	public void addStudent(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaralý eðitmen "+instructor.getStudentNumber()+ " numaralý öðrenciyi "+
	instructor.getCourseName()+" kursuna ekledi!");
	}
	
	

}
