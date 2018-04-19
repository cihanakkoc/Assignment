import java.util.Random;

public class Advisor extends Assignment {
	private String FirstName;
	private String LastName;
	private int Id;
	private int NumberOfStudentsAssigned;

	public Advisor(String FirstName, String LastName) {
		super();
		this.FirstName = FirstName;
		this.FastName = LastName;
		Random rnd = new Random();
		setID(rnd.nextInt() & Integer.MAX_VALUE);
		NumberOfStudentsAssigned = 0;
	}

	public int GetNumberOfStudentsAssigned() {
		return NumberOfStudentsAssigned;
	}
	
	public void AssignStudentToAdvisor()
	{
		if(NumberOfStudentsAssigned >= 3)
		{
			System.out.println("ERROR: Cannot assign more students to advisor ADVISOR ID: " + GetId() + " NAME: " + GetFirstName() + " " + GetLastName());
			System.out.println("**************************************");
			return;
		}
		numberOfStudentsAssigned++;
	}
	
	public void toStrAdvisorDetails()
	{
		System.out.println("ADVISOR ID: " + GetId() + " NAME: " + GetFirstName() + " " + GetLastName()); 
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
	
	public int GetId() {
		return Id;
	}
	
	public void SetId(int Id) {
		this.Id = Id;
	}
}
