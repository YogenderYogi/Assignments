package assignment13;

public class assignment12 {

	public static void main(String[] args) {

		int[] ary = { 7, 1, 5, 3, 4, 6 };
		int[] temp = new int[15];
		int tempVar=0;
		
		for(int i=0;i<ary.length;i++) {
			for(int j=i+1;j<ary.length;j++) {
				if(ary[i]<ary[j]) {
				
					temp[tempVar]=ary[j]-ary[i];
					tempVar++;
					
				}
				
			}
			
		}
		if(tempVar==0) {
			System.out.println("the maximum profit is 0");
			
		}else {
		for(int i=0;i<tempVar;i++) {
			for(int j=0;j<tempVar;j++) {
			int p=0;
				if(temp[i]>temp[j]) {
					p=temp[i];
					temp[i]=temp[j];
					temp[j]=p;
					
				}
				
			}
		}
		System.out.println("the maximum profit "+temp[0]);
		}

	}

}
