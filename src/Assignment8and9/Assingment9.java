package Assignment8and9;

import java.util.ArrayList;
import java.util.List;

public class Assingment9 {

	public static void main(String[] args) {
		List<Integer> bankTran = new ArrayList<Integer>();
		bankTran.add(50000);
		bankTran.add(-2000);
		bankTran.add(3000);
		bankTran.add(-15000);
		bankTran.add(-200);
		bankTran.add(-300);
		bankTran.add(4000);
		bankTran.add(-3000);

		System.out.println("Print total number of credit and debit transactions completed: " + bankTran.size());
		int creditAmount = 0, debitedAmount = 0;

		for (int temp : bankTran) {
			if (temp > 0) {
				creditAmount = creditAmount + temp;
				continue;
			}
			debitedAmount = debitedAmount + temp;

		}

		System.out.println(
				"Print total amount creditAmount : " + creditAmount + ", and debitedAmount : " + debitedAmount);

		int bankBalance = creditAmount - (-debitedAmount);
		System.out.println("Print total amount remaining at the end in Bank Account : " + bankBalance);

		int countSuspicious = 0;
		for (int temp : bankTran) {
			if (temp >= 10000) {
				System.out.println("This is Suspicious credit Limit exceed 10000 : " + temp);
				countSuspicious++;
				continue;
			} else if (temp <= -10000) {
				countSuspicious++;
				System.out.println("This is Suspicious Debit Limit exceed -10000 : " + temp);
				continue;
			}

		}
		System.out.print("Total number of Suspicious transactions : " + countSuspicious);

	}

}
