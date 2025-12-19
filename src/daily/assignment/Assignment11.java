package daily.assignment;

public class Assignment11 {

	public static void main(String[] args) {

		int i = 13, j = 0;
		int k = i - 1;

		while (k > 1) {
			if (i % k == 0) {
				System.out.print("This number is not a Prime Number : "+ i);
				j = 1;
				break;
			}
			k--;

		}
		if (j == 0) {
			System.out.print("This number is a Prime Number : "+ i);
		}

	}

}
