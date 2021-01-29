package utilities;

import java.util.ArrayList;
import java.util.List;

public class CSVCompare {

	static ReadCSVData CSVFile;

	public static void main(String[] args) {

		List<CapReport> expectedCaps = ReadCSVData.getAllCapReport("cap-report-2020-12-01-to-2020-12-31.csv");
		List<CapReport> actualCaps = ReadCSVData.getAllCapReport("cap-report-2020-10-06-to-2020-10-13.csv");
		List<CompareMissedLead> compareResult = new ArrayList<>();

		for (int row1 = 1; row1 < expectedCaps.size(); row1++) {
			String expectedId = expectedCaps.get(row1).getSubscription();
			for (int row2 = 1; row2 < actualCaps.size(); row2++) {
				String actualId = actualCaps.get(row2).getSubscription();

				if (expectedId.equals(actualId)) {
					String expectedMissedLead = expectedCaps.get(row1).getMissedLead();
					String actualMissedLead = actualCaps.get(row2).getMissedLead();
					CompareMissedLead tmp = new CompareMissedLead(expectedId, expectedMissedLead, actualMissedLead,
							false);
					compareResult.add(tmp);
				}
			}
		}

		int compareSize = compareResult.size();
		for (int i = 0; i < compareSize; i++) {

			if (compareResult.get(i).getResult() == true) {
				System.out.println("Kết quả so sánh tại dòng có id : " + compareResult.get(i).getSubID() + " là "
						+ compareResult.get(i).getResult());
			} else {
				System.out.println("Có sự khác biệt tại dòng có id : " + compareResult.get(i).getSubID());
				System.out.println(" Mong đợi là:  " + compareResult.get(i).getExpected() + " nhưng thực tế là: "
						+ compareResult.get(i).getActual());
			}

		}
	}

}
