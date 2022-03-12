
public class HeartRate {
	
	//private data members
	private String firstName;
	private String lastName;
	private int yearBirth;
	private static final int maxHeartRate = 220;
	private static final int currentYear = 2021;
	
	
	//no-arg constructor
	public HeartRate() {
		
	}
	
	//parameterized constructor all fields
	public HeartRate(String firstName, String lastName, int yearBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearBirth = yearBirth;
	}
	
	//parameterized constructor just yearBirth
	public HeartRate(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	//all getters and setters
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getYearBirth() {
		return yearBirth;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	//computeMaxHeartRate Helper Method
	public double computeMaxHeartRate() {
		int age = currentYear - yearBirth;
		return (maxHeartRate - age);
	}
	
	//computeCardioHeartRate Helper method
	
	public double computeCardioHeartRate() {
		int age = currentYear - yearBirth;
		return 0.80*(maxHeartRate - age);
	}
	
	
	

}
