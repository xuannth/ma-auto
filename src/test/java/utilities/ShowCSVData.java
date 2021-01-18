package utilities;

public class ShowCSVData {
	public static final String CSV_FILE_PATH 
	= "/Users/xuan/Downloads/cap-report-2020-10-01-to-2020-10-30.csv";
	static ReadCSVData CSVFile;

	public static void main(String[] args) {

		ReadCSVData.getAllCapReport(CSV_FILE_PATH);

	}

}
