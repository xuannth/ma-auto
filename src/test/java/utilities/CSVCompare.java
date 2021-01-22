package utilities;

import java.util.List;

public class CSVCompare {
	
	static ReadCSVData CSVFile;

	public static void main(String[] args) {
		
		List<CapReport> missLeadFile1 = ReadCSVData.getAllCapReport("cap-report-2020-12-01-to-2020-12-31.csv");
		List<CapReport> missLeadFile2 = ReadCSVData.getAllCapReport("cap-report-2020-10-06-to-2020-10-13.csv");
		
		if (missLeadFile1 == missLeadFile2) {
			System.out.println(" Missed lead is not calculated for selected time.");
		}
		else {
			System.out.println(" Missed lead is calculated correctly for selected time.");
		}

	}

}
