package utilities;

public class ShowCSVData {
	public static final String CSV_FILE_PATH 
	= "C:\\Users\\ADMIN\\Downloads\\cap-report-2020-12-01-to-2020-12-31.csv";
	static ReadCSVData CSVFile;

	public static void main(String[] args) {

		ReadCSVData.getAllCapReport(CSV_FILE_PATH);

	}

}
