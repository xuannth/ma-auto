package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.DashboardPage.BUTTON_COLLAPSE;
import static asia.twentyci.pages.DashboardPage.REPORT_LINK;
import asia.twentyci.pages.DashboardPage;
import net.thucydides.core.annotations.Step;


public class DashboardSteps {

	DashboardPage onDashboard;
	
	@Step
	public void createTheReport() {
		if(isScreenWidth(1024)) {
			onDashboard.find(BUTTON_COLLAPSE).click();
		}
		else {
			onDashboard.find(REPORT_LINK).click();
		}
	}

	private boolean isScreenWidth(int width) {

		if (onDashboard.getDriver().manage().window().getSize().getWidth() == width)
			return true;
		else
			return false;

	}
	
}
