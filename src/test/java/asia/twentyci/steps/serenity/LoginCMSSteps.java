package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.LoginCMSPage.LOGIN_BUTTON;
import static asia.twentyci.pages.LoginCMSPage.EMAIL;
import static asia.twentyci.pages.LoginCMSPage.PASSWORD;

import asia.twentyci.pages.LoginCMSPage;
import net.thucydides.core.annotations.Step;

public class LoginCMSSteps {

	LoginCMSPage onLoginCMSPage;
	
	@Step
	public void openCMS() {
		onLoginCMSPage.open();
	}

	@Step
	public void loginCMSWith(String user_email, String user_password) {
		onLoginCMSPage.open();
		onLoginCMSPage.find(EMAIL).type(user_email);
		onLoginCMSPage.find(PASSWORD).type(user_password);
		onLoginCMSPage.find(LOGIN_BUTTON).click();
	}
}
