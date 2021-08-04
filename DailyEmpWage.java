import java.util.Random;

public class DailyEmpWage {
	static int wagePerHour = 200;

	public static int dailyWage(int amount) {
		return (amount * wagePerHour);
	}

	public static void empIsPresent() {
		Random random = new Random();
		int randomNum = random.nextInt(2);
		if (randomNum == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Day8 Emp Salary computation Problem");
		empIsPresent();
	}

}