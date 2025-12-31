package assignment13;

public class AssignmentCalculatePower {

	public static void main(String[] args) {
		
		
		double x =2.00000;
		int n =-2;
		double result=1;
		
		if(n==0) {
			result =1;
		}
		if (n<0) {
			x=1/x;
			n=-n;
		}
		System.out.print("Value of N and x    "+n+"    "+x);
		for(int i=0;i<n;i++) {
			result=result*x;
		}
		
		//System.out.println(result);

	}

}
