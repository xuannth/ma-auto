package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVCompare {

	static ReadCSVData CSVFile;

	public static void main(String[] args) {

		List<CapReport> CSVFile1 = ReadCSVData.getAllCapReport("cap-report-2020-12-01-to-2020-12-31.csv");
		List<CapReport> CSVFile2 = ReadCSVData.getAllCapReport("cap-report-2020-10-06-to-2020-10-13.csv");
		//List<String> compareResult = new ArrayList<>();

		for(int row1 = 1; row1 < CSVFile1.size(); row1 ++) {
			for(int row2 = 1; row2 < CSVFile2.size(); row2 ++) {
				if(CSVFile1.get(row1).getSubscription() == CSVFile2.get(row2).getSubscription()) {
					CompareMissedLead();
					if(CSVFile1.get(row1).getMissedLead()!=CSVFile2.get(row2).getMissedLead()) {
						System.out.println("Cap report calculate correct!");
					}
					else {
						System.out.println("Cap report calculate incorrect!");
					}
					//compareResult.add(row1);
				}
			}
		}

	}

	private static void CompareMissedLead() {
		// TODO Auto-generated method stub
		
	}

}
