import java.io.Console;

public class Student extends Assignment {
	private String FirstName;
	private String LastName;
	private int Age = 18;
	private int Year = 1;
	private double Gpa = 0;
	
	public Student(String FirstName, String LastName) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public Student(String FirstName, String LastName, int Age) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
	}
	
	public Student(String FirstName, String LastName, int Age, int Year, double Gpa) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.Year = Year;
		this.Gpa = Gpa;
	}

	public int GetYear() {
		return Year;
	}
	
	public void SetYear(int Year) {
		if(Year > 4 || Year < 1) 
		{
			System.out.println("ERROR: Wrong year value for student: " + Year); 
			System.out.println("**************************************");
			return;
		}
		this.Year = Year;
	}
	
	public double GetGPA() {
		return Gpa;
	}
	
	public void SetGPA(double Gpa) {
		if(Gpa > 4 || Gpa < 0) 
		{
			System.out.println("ERROR: Wrong GPA value for student: " + Gpa); 
			System.out.println("**************************************");
			return;
		}
		this.Gpa = Gpa;
	}
	
	public void ToStrStudentDetails()
	{
		System.out.println("STUDENT NAME: " + GetFirstName() + " " + GetLastName()); 
		System.out.println("AGE: " + GetAge()); 
		System.out.println("YEAR: " + GetYear()); 
		System.out.println("GPA: " + GetGPA()); 
		System.out.println("**************************************");
	}
	
	public boolean IsSuccessful()
	{
		if(GetGPA() > 2.5)
			return true;
		return false;
	}
	
	public void CurrentStatus()
	{
		System.out.print("STUDENT: " + GetFirstName() + " " + GetLastName());
		if(isSuccessful())
			System.out.println(" SUCCESSFUL");
		else
			System.out.println(" NOT SUCCESSFUL");
		
		System.out.println("**************************************");
	}
	
	public String GetFirstName() {
		return FirstName;
	}
	
	public void SetFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String GetLastName() {
		return LastName;
	}
	
	public void SetLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public int GetAge() {
		return Age;
	}
	
	public void SetAge(int Age) {
		this.Age = Age;
	}
}
