package utilities;

import java.io.File;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaitForDownloadFile{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WaitForDownloadFile.class);
	
	public static void completed(String nameFile) {
		
		File tempFile = new File(System.getProperty("user.dir") + "/" + nameFile);
		
		DateTime actualDateTime = new DateTime();
		DateTime timeout = actualDateTime.plusMinutes(1);
		
		int current = 0;
		
		while (current != timeout.getSecondOfDay()) {
			if(tempFile.exists()) { 
				LOGGER.info("The Downloading is Completed! ");
				break;
			}
			current = new DateTime().getSecondOfDay();
		}
	}

}
