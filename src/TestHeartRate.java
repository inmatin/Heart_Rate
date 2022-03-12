import java.util.Scanner;

public class TestHeartRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first name: ");
		String fName = input.next();
		
		System.out.println("Please enter the last name: ");
		String lName = input.next();
		
		System.out.println("Please enter the year of birth: ");
		int yearBirth = input.nextInt();
		
		HeartRate hr1 = new HeartRate(fName, lName, yearBirth);
	
		
		System.out.println("The max heart rate for " + hr1.getFirstName() + " is " + hr1.computeMaxHeartRate());

		System.out.println("The cardio heart rate for " + hr1.getFirstName() + " is " + hr1.computeCardioHeartRate());
	
	
		System.out.println(hr1.toString());
		
		input.close();
	}
		
}
