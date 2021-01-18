package asia.twentyci.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ma2.twentyci.asia/admin/")
public class LoginCMSPage extends PageObject{

	public  static final String EMAIL = "//input[@id='email']";
	public  static final String PASSWORD = "//input[@id='password']";
	public  static final String LOGIN_BUTTON = "//button[@type='submit']";
}
