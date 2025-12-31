package assignment13;

public class PrimeNumber {

	public static void main(String[] args) {
		// A Prime Number is a number greater than 1
		// That number divisible only by 1 or itself.

		int input = 5;

		boolean prime = true;

		if (input <= 1) {
			System.out.println(input + " Number is not prime number");
			prime = false;
		} else {
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					prime = false;
				}
			}

			if (prime) {
				System.out.print(input + " Number is Prime number");
			} else {
				System.out.print(input + " Number is not prime Number");
			}
		}

	}

}
