package utilities;

public class ShowCSVData {
	
	static ReadCSVData CSVFile;

	public static void main(String[] args) {
		ReadCSVData.getAllCapReport("cap-report-2020-12-01-to-2020-12-31.csv");
		ReadCSVData.getAllCapReport("cap-report-2020-10-06-to-2020-10-13.csv");
		ReadCSVData.getAllCapReport("cap-report-2020-10-14-to-2020-10-16.csv");

	}

}
