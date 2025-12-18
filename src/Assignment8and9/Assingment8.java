package Assignment8and9;

public class Assingment8 {

	public static void main(String[] args) {
		int[] ary = { 12, 34, 11, 36, 87, 98, 93 };

		int tempVar = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {

				if (ary[i] > ary[j]) {
					tempVar = ary[j];
					ary[j] = ary[i];
					ary[i] = tempVar;
				}
			}

		}
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");

		}
		System.out.println();

		// Print the second and third largest number from the array.

		System.out
				.print("Second larget Number in array is = " + ary[1] + ", Third largest Number in array is = " + ary[2]);
	}

}
