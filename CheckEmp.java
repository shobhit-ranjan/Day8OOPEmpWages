import java.util.Random;

public class CheckEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Day8 Emp Salary computation Problem");
		empIsPresent();
	}

	public static void empIsPresent() {
		Random random = new Random();
		int randomNum = random.nextInt(2);
		if (randomNum == 1) {
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}
