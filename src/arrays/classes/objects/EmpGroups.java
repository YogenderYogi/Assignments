package arrays.classes.objects;

public class EmpGroups extends Emplyoees{

	String[] empNames = { empName1, empName2, empName3 };
	int[] empIds = { empId1, empId2, empId3 };

	public static void main(String[] args) {

		EmpGroups obj = new EmpGroups();

		System.out.println("Employee Name: " + obj.empNames[0] + ", Employee ID: " + obj.empIds[0]);
		System.out.println("Employee Name: " + obj.empNames[1] + ", Employee ID: " + obj.empIds[1]);
		System.out.println("Employee Name: " + obj.empNames[2] + ", Employee ID: " + obj.empIds[2]);

	}

}
