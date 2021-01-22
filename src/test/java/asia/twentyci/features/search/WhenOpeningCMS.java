package asia.twentyci.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import asia.twentyci.steps.serenity.DashboardSteps;
import asia.twentyci.steps.serenity.LoginCMSSteps;
import asia.twentyci.steps.serenity.ReportSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import utilities.WaitForDownloadFile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class WhenOpeningCMS {
	
	@Managed
	WebDriver driver;
	
	@Steps 
	LoginCMSSteps atLoginCMSSteps;
	
	@Steps 
	DashboardSteps atDashboardSteps;
	
	@Steps 
	ReportSteps atReportSteps;

	private String actualString;
	
	@Test
	public void open_cms() {
			
		String useremail = "admin@twentyea.co.uk";
		String password = "Password123!";
		String startdate1 = "01/12/2020";
		String enddate1 = "31/12/2020";
		String startdate2 = "06/10/2020";
		String enddate2 = "13/10/2020";

		atLoginCMSSteps.loginCMSWith(useremail, password);
		atDashboardSteps.createTheReport();
		atReportSteps.CreateReportWith(startdate1,enddate1);
		WaitForDownloadFile.completed("cap-report-2020-12-01-to-2020-12-31.csv");
		atDashboardSteps.createTheReport();
		atReportSteps.CreateReportWith(startdate2,enddate2);
		WaitForDownloadFile.completed("cap-report-2020-10-06-to-2020-10-13.csv");
	}
}
