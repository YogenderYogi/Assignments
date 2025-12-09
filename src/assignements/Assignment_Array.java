package assignements;

import java.util.Scanner;

public class Assignment_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Semesters : ");
		int semesters = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the number of Subjects : ");
		int subject = sc.nextInt();
		sc.nextLine();

		String[][][] sem = new String[semesters][subject][subject];

		for (int i = 0; i < semesters; i++) {
			int a = i + 1;
			System.out.println("Enter the Subject Name and Market in Semester : " + a);
			for (int j = 0; j < subject; j++) {

				for (int k = 0; k < 2; k++) {
					System.out.print("Enter the Subject Name: ");
					sem[i][j][k] = sc.nextLine();
					k++;
					System.out.print("Enter the markes in semester: ");
					sem[i][j][k] = sc.nextLine();

				}
			}

		}

		System.out.println("==============================================Printing Mark Sheet==============================================");

		for (int i = 0; i < semesters; i++) {
			int a = 0;
			a = i + 1;
			System.out.print("Semester " + a + " : ");
			for (int j = 0; j < subject; j++) {
				// System.out.print("Subject Name "+sem[i][j]);
				for (int k = 0; k < 2; k++) {
					System.out.print(" Subject name " + sem[i][j][k] + " Status(Marks) = ");
					k++;
					int number = Integer.parseInt(sem[i][j][k]);
					if (number > 40) {
						System.out.print(" Pass (" + number + ")");
					} else {
						System.out.print(" Fail (" + number + ")");
					}

				}
			}
			System.out.println();

		}

		sc.close();
	}

}
