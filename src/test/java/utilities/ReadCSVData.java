package utilities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;

public class ReadCSVData {
	
	private static CSVReader csvReader;

	public static List<CapReport> getAllCapReport(String file) {
		
		try { 
			FileReader filereader = new FileReader(System.getProperty("user.dir") + "/" + file); 
			  
	        csvReader = new CSVReaderBuilder(filereader) 
                    .withSkipLines(1) 
                    .build(); 

			List<CapReport> allCapReports = new ArrayList<>();
			
			String[] nextRecord;
			
			while ((nextRecord = csvReader.readNext()) != null) {
				
				String sub = nextRecord[0];
				String clientName = nextRecord[1];
				String userName = nextRecord[2];
				int numOrder = Integer.parseInt(nextRecord[3]);
				int leadTotal = Integer.parseInt(nextRecord[4]);
				int capTotal = Integer.parseInt(nextRecord[5]);
				String leadMissed = nextRecord[6];
				int deff = Integer.parseInt(nextRecord[7]);
	
				CapReport capReport = new CapReport(sub, clientName, userName, numOrder, leadTotal, capTotal, leadMissed, deff);
	
				allCapReports.add(capReport);
				
	
			}
			return allCapReports;
			
		} 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
		return null; 
	}
		

}
