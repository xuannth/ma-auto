package utilities;

public class ShowCSVData {
	public static final String CSV_FILE_1_PATH 
	= "C:\\Users\\ADMIN\\Downloads\\cap-report-2020-12-01-to-2020-12-31.csv";
	public static final String CSV_FILE_2_PATH 
	= "C:\\Users\\ADMIN\\Downloads\\cap-report-2020-10-06-to-2020-10-13.csv";
	
	static ReadCSVData CSVFile;

	public static void main(String[] args) {

		ReadCSVData.getAllCapReport(CSV_FILE_1_PATH);
		ReadCSVData.getAllCapReport(CSV_FILE_2_PATH);
		//ReadCSVData.getAllCapReport(CSV_FILE_3_PATH);

	}

}
