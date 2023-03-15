package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;


public class RetailHomePage extends BaseSetup {
	
	 public RetailHomePage() {
	        PageFactory.initElements(getDriver(), this);
	    }
	 
	 @FindBy(id ="signinBtn") 
	 public WebElement signInButton;
	 
	 @FindBy(linkText ="TEKSCHOOL") 
	    public WebElement tekshoolLogo;
	 
	 @FindBy(id ="searchInput") 
	    public WebElement searchBarInput;
	    
	    @FindBy(id ="searchBtn") 
	    public WebElement searchButton;

		@FindBy(xpath = "//img[contains(@alt,'Pokemon')]")
		public WebElement pokemonImage;
		
		@FindBy(id="signinLink")
		public WebElement signInOption;
		
		@FindBy(xpath="//a[text()='Account']")
		public WebElement accountOption;

}
