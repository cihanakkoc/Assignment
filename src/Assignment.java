import java.util.Calendar;
import java.util.Date;

public class Assignment {
	public static String WhichSemester(int Month) {
	    switch(Month) {
        case Calendar.SEPTEMBER:
        case Calendar.OCTOBER:
        case Calendar.NOVEMBER:
        case Calendar.DECEMBER:
        case Calendar.JANUARY:
              return "FALL";
        case Calendar.FEBRUARY:
        case Calendar.MARCH:
        case Calendar.APRIL:
        case Calendar.MAY:
        case Calendar.JUNE:
              return "SPRING";
        default:
              return "SUMMER";
	    }
	}
	
	public static void GetAdvisorStudents(Advisor advi)
	{
		System.out.println(advi.GetFirstName() + " " + advi.GetLastName() + " NumberOfStudents : " + advi.GetNumberOfStudentsAssigned());
		System.out.println("**************************************");
	}
	
	public static void GetMonth()
	{
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("Current Semester is " + WhichSemester(calendar.get(Calendar.MONTH)));
		System.out.println("**************************************");
	}
	
	public static void main(String[] args) {
		/* Students Create  */
		Student FirstStudent = new Student("Cihan","AKKOC",23,1,2);
		Student SecondStudent = new Student("Berivan","BAYDAR", 21,2,3);
		Student ThirtStudent = new Student("Ayse","FATMA",20,1,2);
		Student FourthStudent = new Student("Ali","AHMET",23,1,2);
		
		/* Advisor Create  */
		Advisor FirstAdvisor = new Advisor("Bill","GATES");
		Advisor SecondAdvisor = new Advisor("Steve","JOBS");
		Advisor ThirtAdvisor = new Advisor("Mark","ZUC");
		
		/* Advisor Assign Student  */
		FirstAdvisor.AssignStudentToAdvisor();
		FirstAdvisor.AssignStudentToAdvisor();
		FirstAdvisor.AssignStudentToAdvisor();
		FirstAdvisor.AssignStudentToAdvisor();
		
		/* Advisor Get Students Count  */
		GetAdvisorStudents(FirstAdvisor);
		
		/* Advisor Assign Student  */
		SecondAdvisor.assignStudentToAdvisor();
		
		/* Advisor Get Students Count  */
		GetAdvisorStudents(SecondAdvisor);
		
		/* Advisor Get Students Count  */
		GetAdvisorStudents(ThirtAdvisor);
		
		/* Student Details  */
		SecondStudent.ToStrStudentDetails();
		
		/* Student GPA Status  */
		ThirtStudent.CurrentStatus();
		
		/* Student Setter/Getter Test Method  */
		FourthStudent.SetYear(10);
		FourthStudent.SetGPA(-1.0);
		
		/* Student GPA Status  */
		FourthStudent.CurrentStatus();
		
		/* Get Month and Select Season  */
		GetMonth();
		
		/* Advisor Details  */
		FirstAdvisor.ToStrAdvisorDetails();
		SecondAdvisor.ToStrAdvisorDetails();
		ThirtAdvisor.ToStrAdvisorDetails();
	}
}
