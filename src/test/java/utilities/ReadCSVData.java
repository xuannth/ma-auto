package utilities;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;

public class ReadCSVData {
	
	private static CSVReader csvReader;

	public static List<CapReport> getAllCapReport(String file) {
		
		try { 
			FileReader filereader = new FileReader(file); 
			  
	        csvReader = new CSVReader(filereader); 

			List<CapReport> allCapReports = new ArrayList<>();
			
			String[] nextRecord;
			
			while ((nextRecord = csvReader.readNext()) != null) {
				
				float sub = Float.valueOf(nextRecord[0]);
				String clientName = nextRecord[1];
				String userName = nextRecord[2];
				float numOrder = Float.valueOf(nextRecord[3]);
				float leadTotal = Float.valueOf(nextRecord[4]);
				float capTotal = Float.valueOf(nextRecord[5]);
				float leadMissed = Float.valueOf(nextRecord[6]);
				float deff = Float.valueOf(nextRecord[7]);
	
				CapReport capReport = new CapReport(sub, clientName, userName, numOrder, leadTotal, capTotal, leadMissed, deff);
	
				allCapReports.add(capReport);
				
	
			}
			
			for(int i = 0; i < allCapReports.size(); i ++) {
				if(allCapReports.get(i).getSubscription() == 2458) {
					System.out.println(allCapReports.get(i).getMissedLead());
				}
			} 
				
			return allCapReports;
			
		} 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
		return null; 
	}
		

}
