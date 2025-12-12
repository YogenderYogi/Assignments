package assignements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysAndCollections {

	public static void main(String[] args) {

		// 1. Create List with area of top 5 largest cities. Print the total area of the
		// 3rd and 4th cities combined.

		List<Integer> area = new ArrayList<Integer>();
		System.out.println("1. Area of top 5 larget citiest are 10, 11, 12, 13, 14 per sq KM ");
		area.add(10);
		area.add(11);
		area.add(12);
		area.add(13);
		area.add(14);
		System.out.println("Total area of 4th city and 5th city is : " + (area.get(2) + area.get(3)));
		System.out.println();

		// 2. Create a set of the 10 most visited tourist attractions in the world and
		// print out all of them and its size.
		Set<String> touristPlace = new HashSet<String>();
		System.out.println(
				"2. 10 Most visited attractions are Place1, Place2, Place3, Place4, Place5, Place6, Place7, Place8, Place9, Place10");
		touristPlace.add("Place1");
		touristPlace.add("Place2");
		touristPlace.add("Place3");
		touristPlace.add("Place4");
		touristPlace.add("Place5");
		touristPlace.add("Place6");
		touristPlace.add("Place7");
		touristPlace.add("Place8");
		touristPlace.add("Place9");
		touristPlace.add("Place10");
		System.out.println("10 most visited tourist attaraction are : " + touristPlace);
		System.out.println("The size is :" + touristPlace.size());
		System.out.println();

		// 3. Create an array of 10 numbers (any 10 numbers) and print out the Average
		// of 5th and 6 value.
		System.out.println("3. Array with 10 Numbers");
		int[] arrayOf10Numbers = new int[10];
		arrayOf10Numbers[0] = 1;
		arrayOf10Numbers[1] = 2;
		arrayOf10Numbers[2] = 3;
		arrayOf10Numbers[3] = 4;
		arrayOf10Numbers[4] = 5;
		arrayOf10Numbers[5] = 6;
		arrayOf10Numbers[6] = 7;
		arrayOf10Numbers[7] = 8;
		arrayOf10Numbers[8] = 9;
		arrayOf10Numbers[9] = 10;

		int sumOfArray = arrayOf10Numbers[4] + arrayOf10Numbers[5];
		int average = sumOfArray / 2;
		System.out.println("The average of total number is :" + average);
		System.out.println();

		// 4. Create a list of the top 5 hightest-grossing movies of all time and print
		// out the third movie on the list.
		List<String> movies = new ArrayList<String>();
		System.out.println(
				"4. Top 5 hightest-grossing movies of  all times are: Movie1, Movie2, Movie3, Movie4, Movie5,");
		movies.add("Movie1");
		movies.add("Movie2");
		movies.add("Movie3");
		movies.add("Movie4");
		movies.add("Movie5");
		System.out.println("3rd Movie : " + movies.get(2));
		System.out.println();
		System.out.println();

		/*
		 * Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 */

		String[] studentName = { "Suresh", "Mahesh", "Naresh" };
		int[] Marks = { 75, 80, 82 };
		int[] extra10Marks = new int[3];
		extra10Marks[0] = Marks[0] + 10;
		extra10Marks[1] = Marks[1] + 10;
		extra10Marks[2] = Marks[2] + 10;
		System.out.println("Updated Marks:");
		System.out.println(studentName[0] + ": " + extra10Marks[0]);
		System.out.println(studentName[1] + ": " + extra10Marks[1]);
		System.out.println(studentName[2] + ": " + extra10Marks[2]);

		int sum = extra10Marks[0] + extra10Marks[1] + extra10Marks[2];
		float avg = sum / 3;
		System.out.println("The average of total number is :" + avg);
		System.out.println();

	}

}
