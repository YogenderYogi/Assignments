package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class collectionAssignment {

	public static void main(String[] args) {

		List<String> productP001 = new ArrayList<String>();
		productP001.add("P001");
		productP001.add("Laptop");
		productP001.add("Electronic");
		productP001.add("12k Prounds");
		productP001.add("Not Available");
		productP001.add("Tecj Supplies");
		productP001.add("2 years");
		productP001.add("4.5 Stars");
		productP001.add("Aug 2023");
		productP001.add("Aug 2028");

		List<String> productP002 = new ArrayList<String>();
		productP002.add("P002");
		productP002.add("Desk Chair");
		productP002.add("Furniture");
		productP002.add("150k Pounds");
		productP002.add("Two");
		productP002.add("Office Depot");
		productP002.add("1 years");
		productP002.add("4 Stars");
		productP002.add("Sep 2024");
		productP002.add("N/A");

		List<String> productP003 = new ArrayList<String>();
		productP003.add("P003");
		productP003.add("Coffee Maker");
		productP003.add("Kitchen");
		productP003.add("72Prounds");
		productP003.add("Two Hundred");
		productP003.add("KitchenWorld");
		productP003.add("6 months");
		productP003.add("4.2 Stars");
		productP003.add("Jan 2025");
		productP003.add("Jan 2027");

		Map<String, List<String>> allSheetInSingleMap = new LinkedHashMap<>();

		allSheetInSingleMap.put("ProductSheetData1", productP001);
		allSheetInSingleMap.put("ProductSheetData2", productP002);
		allSheetInSingleMap.put("ProductSheetData3", productP003);

		List<String> employeeE001 = new ArrayList<String>();
		employeeE001.add("E001");
		employeeE001.add("Alice Green");
		employeeE001.add("Thirty");
		employeeE001.add("Female");
		employeeE001.add("Engineering");
		employeeE001.add("Software Engineer");
		employeeE001.add("75k Pounds");
		employeeE001.add("alice@examle.com");
		employeeE001.add("SDF65765");

		List<String> employeeE002 = new ArrayList<String>();
		employeeE002.add("E002");
		employeeE002.add("Bob Johnson");
		employeeE002.add("Thirty Five");
		employeeE002.add("Male");
		employeeE002.add("Marketing");
		employeeE002.add("Marketing Manager");
		employeeE002.add("85k Pounds");
		employeeE002.add("bob@example.com");
		employeeE002.add("REW876876");

		List<String> employeeE003 = new ArrayList<String>();
		employeeE003.add("E003");
		employeeE003.add("Carol White");
		employeeE003.add("Twenty Eight");
		employeeE003.add("Female");
		employeeE003.add("Sales");
		employeeE003.add("Sales Executive");
		employeeE003.add("66k Prounds");
		employeeE003.add("carol@example.com");
		employeeE003.add("TYR34545345");

		// Map<String, List<String>> empSheet = new LinkedHashMap<>();

		allSheetInSingleMap.put("empSheetData1", employeeE003);
		allSheetInSingleMap.put("empSheetData2", employeeE003);
		allSheetInSingleMap.put("empSheetData3", employeeE003);

		List<String> student1 = new ArrayList<String>();
		student1.add("E001");
		student1.add("Alice Green");
		student1.add("Thirty");
		student1.add("Female");
		student1.add("Engineering");
		student1.add("Software Engineer");
		student1.add("75k Pounds");
		student1.add("alice@examle.com");
		student1.add("SDF65765");

		List<String> student2 = new ArrayList<String>();
		student2.add("E002");
		student2.add("Bob Johnson");
		student2.add("Thirty Five");
		student2.add("Male");
		student2.add("Marketing");
		student2.add("Marketing Manager");
		student2.add("85k Pounds");
		student2.add("bob@example.com");
		student2.add("REW876876");

		List<String> student3 = new ArrayList<String>();
		student3.add("E003");
		student3.add("Carol White");
		student3.add("Twenty Eight");
		student3.add("Female");
		student3.add("Sales");
		student3.add("Sales Executive");
		student3.add("66k Prounds");
		student3.add("carol@example.com");
		student3.add("TYR34545345");

		// Map<String, List<String>> stuSheet = new LinkedHashMap<>();

		allSheetInSingleMap.put("stuSheetData1", student1);
		allSheetInSingleMap.put("stuSheetData2", student2);
		allSheetInSingleMap.put("stuSheetData3", student3);

		// All 3 Sheets are in one Variable
		System.out.println(allSheetInSingleMap);

		// Printing the

		System.out.println(
				"Printing the data from Product Details: " + allSheetInSingleMap.get("ProductSheetData2").get(5));

	}

}
