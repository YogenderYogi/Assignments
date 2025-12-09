package assignements;

import java.util.Arrays;

public class marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String [] sem = new String[5];
//		sem[0]="Sem 1";
//		sem[1]="Sem 2";
//		sem[2]="Sem 3";
//		sem[3]="Sem 4";
//		sem[4]="Sem 5";
//		
//		System.out.println(Arrays.toString(sem));
//		
//		String [][] semSub = new String[5][6];
//		
//		
//		semSub[0][0]="M1";
//		semSub[0][1]="M1";
//		semSub[0][2]="M1";
//		semSub[0][3]="M1";
//		semSub[0][4]="M1";
//		semSub[0][5]="M1";
//		
//		semSub[1][0]="S1";
//		semSub[1][1]="S1";
//		semSub[1][2]="S1";
//		semSub[1][3]="S1";
//		semSub[1][4]="S1";
//		semSub[1][5]="S1";
//		
//		semSub[2][0]="D1";
//		semSub[2][1]="D1";
//		semSub[2][2]="D1";
//		semSub[2][3]="D1";
//		semSub[2][4]="D1";
//		semSub[2][5]="D1";
//		
//		semSub[3][0]="E1";
//		semSub[3][1]="E1";
//		semSub[3][2]="E1";
//		semSub[3][3]="E1";
//		semSub[3][4]="E1";
//		semSub[3][5]="E1";
//		
//		semSub[4][0]="F1";
//		semSub[4][1]="F1";
//		semSub[4][2]="F1";
//		semSub[4][3]="F1";
//		semSub[4][4]="F1";
//		semSub[4][5]="F1";
//		
//		semSub[5][0]="G1";
//		semSub[5][1]="G1";
//		semSub[5][2]="G1";
//		semSub[5][3]="G1";
//		semSub[5][4]="G1";
//		semSub[5][5]="G1";
//		
//		//System.out.println(Arrays.deepToString(semSub));

		String[][][] marksheet = new String[5][2][6];

		marksheet[0][0][0] = "Math 1";
		marksheet[0][0][1] = "Physics";
		marksheet[0][0][2] = "Chemestry";
		marksheet[0][0][3] = "Computer Programming";
		marksheet[0][0][4] = "Engineering Drawing";
		marksheet[0][0][5] = "Basic Electric Eng";

		marksheet[0][1][0] = "Pass(78)";
		marksheet[0][1][1] = "Pass(85)";
		marksheet[0][1][2] = "Fail(21)";
		marksheet[0][1][3] = "Pass(74)";
		marksheet[0][1][4] = "Pass(88)";
		marksheet[0][1][5] = "Pass(79)";

		marksheet[1][0][0] = "Math 2";
		marksheet[1][0][1] = "Machanics";
		marksheet[1][0][2] = "Environment";
		marksheet[1][0][3] = "Basic Electronics";
		marksheet[1][0][4] = "Engineering Physics";
		marksheet[1][0][5] = "Engineering Graphics";

		marksheet[1][1][0] = "Pass(82)";
		marksheet[1][1][1] = "Pass(77)";
		marksheet[1][1][2] = "Pass(93)";
		marksheet[1][1][3] = "Fail(19)";
		marksheet[1][1][4] = "Fail(24)";
		marksheet[1][1][5] = "Pass(90)";

		marksheet[2][0][0] = "Data Structures";
		marksheet[2][0][1] = "Discrete Mathmatics";
		marksheet[2][0][2] = "Digital Electronics";
		marksheet[2][0][3] = "Operating Systems";
		marksheet[2][0][4] = "Signals and Systems";
		marksheet[2][0][5] = "object Oriented Prog";

		marksheet[2][1][0] = "Pass(88)";
		marksheet[2][1][1] = "Pass(81)";
		marksheet[2][1][2] = "Pass(76)";
		marksheet[2][1][3] = "Fail(32)";
		marksheet[2][1][4] = "Pass(85)";
		marksheet[2][1][5] = "Pass(78)";

		marksheet[3][0][0] = "Algorithms";
		marksheet[3][0][1] = "Computer Network";
		marksheet[3][0][2] = "Database System";
		marksheet[3][0][3] = "Microprocessors";
		marksheet[3][0][4] = "Communication Eng.";
		marksheet[3][0][5] = "Software Engineering";

		marksheet[3][1][0] = "Pass(91)";
		marksheet[3][1][1] = "Pass(73)";
		marksheet[3][1][2] = "Fail(19)";
		marksheet[3][1][3] = "Pass(80)";
		marksheet[3][1][4] = "Pass(76)";
		marksheet[3][1][5] = "Pass(87)";

		marksheet[4][0][0] = "Probability & Stats";
		marksheet[4][0][1] = "Machine Learning";
		marksheet[4][0][2] = "Computer Design";
		marksheet[4][0][3] = "Theory of Computation";
		marksheet[4][0][4] = "Embedded Systems";
		marksheet[4][0][5] = "Computer Graphics";

		marksheet[4][1][0] = "Pass(86)";
		marksheet[4][1][1] = "Pass(88)";
		marksheet[4][1][2] = "Pass(84)";
		marksheet[4][1][3] = "Pass(95)";
		marksheet[4][1][4] = "Pass(73)";
		marksheet[4][1][5] = "Pass(90)";

		// Print Semester 2 Subject 4 and Subject 5 Names.

		System.out.println("Semster 2 Subject 4 Name is : " + marksheet[1][0][3] + " and Subject 5 Name is : "
				+ marksheet[1][0][5]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6
		System.out.println("Status/Marks of Semster 4 Subject 3 is : " + marksheet[3][1][2]
				+ " and Status/Marks for Subject 6 is : " + marksheet[3][01][5]);

	}

}
