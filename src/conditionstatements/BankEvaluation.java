package conditionstatements;

public class BankEvaluation {

	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore = 650;
		float income = 50000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore > 750) {

			System.out.println("The loan is automatically approved.");
		}

		else if (creditScore <= 750 && creditScore >= 650) {

			if (income >= 50000) {
				if (isEmployed == true) {
					if (debtToIncomeRatio < 40) {
						System.out.println("The loan is approved");
					} else {
						System.out.println("Due to DTI ratio is 40% or greater, the loan is denied.");
					}
				} else {
					System.out.println("Customer is unemployed, the loan is denied.");
				}
			} else {
				System.out.println("Due to the income, the loan is denied.");
			}
		} else {
			System.out.println("Due to the credit score is below 650, the loan is denied.");
		}

	}

}
