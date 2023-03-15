package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage(){
		PageFactory.initElements(getDriver(), this);
	}

}
