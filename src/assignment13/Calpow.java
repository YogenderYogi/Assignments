package assignment13;

public interface Calpow {

	double x = 2.00000, n = -2;

	default void displayvalue() {
		calpowers();
	}

	private void calpowers() {
		double temp = 1;
		
		if(n==0)
		{
			System.out.println("The the value of n is : " + n);
		}
		else if(n>1) {
			for (int i = 0; i < n; i++) {
				temp = temp * x;
			}
			System.out.printf("The output is : %.5f ", temp);	
		}else {
			for (int i = 0; i > n; i--) {
				temp = temp / x;
			}
			System.out.printf("The output is : %.5f ", temp);	
		
		}
		
	}

}
