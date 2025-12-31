package assignment13;

public class StockeMarket {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int maxProfit = 0, sellDay = 0, buyDay = 0;

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				int profit = prices[j] - prices[i];
				if (profit > maxProfit) {

					maxProfit = profit;
					buyDay = i + 1;
					sellDay = j + 1;

				}

			}

		}
		System.out.print("The max profit is " + maxProfit + " on the Sele day " + sellDay + " The buyDay was " + buyDay);

	}

}
