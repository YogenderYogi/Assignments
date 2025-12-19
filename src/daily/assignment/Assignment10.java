package daily.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment10 {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Alice Johnson");
		name.add("Bob Smith");
		name.add("Carol Davis");
		name.add("David Brown");
		name.add("Eva Green");
		System.out.println(name);

		List<Float> record1 = new ArrayList<Float>();
		record1.add(75000.0f);
		record1.add(5.1f);
		record1.add(4.2f);

		List<Float> record2 = new ArrayList<Float>();
		record2.add(68000.0f);
		record2.add(3.2f);
		record2.add(3.8f);

		List<Float> record3 = new ArrayList<Float>();
		record3.add(82000.0f);
		record3.add(7.1f);
		record3.add(4.5f);

		List<Float> record4 = new ArrayList<Float>();
		record4.add(90000.0f);
		record4.add(10.2f);
		record4.add(2.5f);

		List<Float> record5 = new ArrayList<Float>();
		record5.add(60000.0f);
		record5.add(2.4f);
		record5.add(3.5f);

		List<List> empTable = new ArrayList<List>();
		empTable.add(record1);
		empTable.add(record2);
		empTable.add(record3);
		empTable.add(record4);
		empTable.add(record5);

		System.out.print(name);

		System.out.println();
		System.out.print(empTable);
		System.out.println();
		System.out.println();
		System.out.println();

		float BaseSalary = 0.0f, exprienceYear = 0, rating = 0;

		Map<String, Double> hikePercentageRecord = new HashMap<String, Double>();

		for (int i = 0; i < empTable.size(); i++) {
			for (int j = 0; j < record5.size() - 1; j++) {
				BaseSalary = (float) empTable.get(i).get(j);
				j++;
				exprienceYear = (float) empTable.get(i).get(j);
				j++;
				rating = (float) empTable.get(i).get(j);

				System.out.println(
						"The basic salary " + BaseSalary + " exp in years " + exprienceYear + " Rating " + rating);

				float hike = 0;

				if (rating >= 4.0) {
					hike = (BaseSalary * (15f / 100f)) + 1500;
					// System.out.print(hike);

				} else if (rating >= 3 && rating < 4) {

					hike = (BaseSalary * (10f / 100f)) + 1200;
				} else if (rating < 3) {
					hike = (BaseSalary * (3f / 100f)) + 300;
				}

				if (exprienceYear >= 5) {
					hike = hike + 5000;
					// System.out.print(hike);
				}

				// System.out.println();
				hikePercentageRecord.put(name.get(i), (double) (BaseSalary / hike));
			}

		}
		System.out.println();

		System.out.println(hikePercentageRecord);

	}

}
