
public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaral� e�itmen "+instructor.getFirstName()+" "
				+instructor.getLastName()+" "+instructor.getCourseName()+" ad�nda bir kurs ekledi!");
		
	}
	public void addStudent(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+ " numaral� e�itmen "+instructor.getStudentNumber()+ " numaral� ��renciyi "+
	instructor.getCourseName()+" kursuna ekledi!");
	}
	
	

}
