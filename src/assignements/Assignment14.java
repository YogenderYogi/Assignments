package assignements;

public class Assignment14 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k >= -2; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println("");
		}

		for (int i = 1; i < n; i++) {
			for (int k = 1; k < i + 4; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {

				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
