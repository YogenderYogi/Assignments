package assignements;

public class Assingment15to17 {

	public static void main(String[] args) throws NullPointerException {

		// Assignment 15: Write a program to perform the following tasks.

		// 1. Count the number of words in the sentence
		String sentence = "Java programming is a fun and challenging";

		int count = 1;
		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println("Total Number of words in the sentence is : " + count);

		// 2. Print the sentence words in reverse order.

		int k = 0;
		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) == ' ') {
				int j = 0;
				for (j = i - 1; j >= k; j--) {
					System.out.print(sentence.charAt(j));
				}
				k = i;

				System.out.print(" ");
			}
		}
		for (int i = sentence.length() - 1; i > 0; i--) {

			System.out.print(sentence.charAt(i));
			if (sentence.charAt(i) == ' ') {
				break;
			}

		}

		System.out.println("");

		// 3. Convert the first Character of each word upper case and print the original
		// sentence.

		for (int i = 0; i < sentence.length(); i++) {

			if (i == 0) {
				char a = sentence.charAt(i);
				char upper = Character.toUpperCase(a);
				System.out.print(upper);
			}

			else if (sentence.charAt(i) == ' ') {
				System.out.print(" ");
				char a = sentence.charAt(++i);
				char upper = Character.toUpperCase(a);
				System.out.print(upper);
			} else {

				System.out.print(sentence.charAt(i));
			}
		}
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");

		// Assignment 16:

		char[] words = new char[sentence.length()];
		int num = 0, indx = 0;

		String[] totalwords = new String[count];

		// String sentence = "Java programming is a fun and challenging";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				words[num] = sentence.charAt(i);
				num++;

//				totalwords[indx]= new String(words);
//				indx++;
//				num=0;
			} else {
//				words[num]=sentence.charAt(i);
//				num++;
				totalwords[indx] = new String(words);
				indx++;
				for (int p = 0; p < num; p++) {
					words[p] = ' ';

				}
				num = 0;
			}

		}

		num = 0;
		indx = 0;
		for (int i = 0; i < totalwords.length; i++) {
			System.out.println(totalwords[i]);
		}
		String str = "Java";

		for (String word : totalwords) {
			if (word != null) {
				str = word.trim();
				if (str.equals("Java")) {
					num++;
					indx++;
				}

			} else {
				str = null; // or handle the null case as appropriate for your logic
			}

		}

		System.out.print("Total number of occurrences: " + num + " Indexes of the word " + (indx - 1));

		// Assignment 17:
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");

		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
