package asia.twentyci.steps.serenity;
import static asia.twentyci.pages.ReportPage.CAP_REPORT;
import static asia.twentyci.pages.ReportPage.END_DATE;
import static asia.twentyci.pages.ReportPage.START_DATE;

import asia.twentyci.pages.ReportPage;
import net.thucydides.core.annotations.Step;

public class ReportSteps {
	
	ReportPage onReportPage;
	
	@Step
	public void CreateReportWith(String start_date, String end_date) {
		
		onReportPage.find(START_DATE).type(start_date);
		onReportPage.find(END_DATE).type(end_date);
		onReportPage.find(CAP_REPORT).click();
	}
	
}
