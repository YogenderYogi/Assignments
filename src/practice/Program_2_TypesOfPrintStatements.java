package practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Program_2_TypesOfPrintStatements {

	public static void main(String[] args) throws FileNotFoundException {

		// JAVA Print Statements
		// 1. Print the information and go to the next line.
		System.out.println("Hello world!");

		// 2. Print the information and stay on the same line.
		System.out.print("Hello, ");
		System.out.print("World!, ");
		System.out.println("");

		// 3. Print the dynamic and formated content and stay on the same line.
		System.out.println("Deepika is completed B.Tech and employee ID is 1234 and Visa status is true");
		System.out.println("Prabhu is completed B.Tech and employee ID is 1235 and Visa status is false");
		System.out.println("Laxshmi is completed B.Tech and emplyoee ID is 1236 and Visa status is false");

		// Combined Lines in Window machine use shortcut : ALT + Shift + Y | for MAC use shortcut: CMD + Opt + Y

		// We can use Format Specifier (or placeholder). They are used in methods like System.Out.printf(); or String.format(); to control how data is inserted and
		// displayed within string.

		// 1. %s ==> String, 2. %d ==> Integer, 3. %f ==> Floating Point, 4. %b ==> Boolean, 5. %c ==> Character
		System.out.printf("%s is completed B.Tech and emplyee ID is %d and Visa status is %b", "John", 1237, "true");
		System.out.println("");

		double price = 199.230343;
		System.out.printf("Pice is : %.3f", price);
		System.out.println("");

		// 4. Print the error message.
		System.err.println("The error Print in Red color. You can print the error here ");
		System.out.println("");

		// 5. Print a multi-line message.
		System.out.println("""
				My name is Prabhu.
					My qualification is MCA
					My role is Quality Engineer """);
		System.out.println("");

		// 6. Print the logs during the execution process to monitor and understand the
		// outcome of each and every line and each and every stage.

		// Note: Now there is no log4j is required in Java because Java itself is going
		// to have logging mechanism by default.
		Logger log = Logger.getLogger("Hello World!");
		log.info("Hey man, currently we have completed line number 55 successfully Congratulation!");
		System.out.println("");

		log.warning("Hey man, we have complted linek number 58, but unfortunately, there is some issue. Please check.");

		// Print the logs during the execution process to monitor and understand the outcome of each and every line and for each and every stage so for that Java people introduce logger mechanism.

		// 9. Print and export the log messages into a text file.
		PrintWriter logger = new PrintWriter("\\Users\\yogender\\JavaTraining\\JavaTraining\\Logs.txt");
		logger.println("Hello user. Currently line number 64 is Successfully completed.");
		logger.println("Hello user. Currently line number 65 is successfully completed.");
		logger.close();
	}

}
