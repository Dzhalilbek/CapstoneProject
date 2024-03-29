package tek.sdet.framework.config;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadless implements Browser {
	
	public WebDriver openBrowser(String url) {
        WebDriverManager.firefoxdriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        WebDriver driver = new EdgeDriver(options);
        driver.get(url);
        return driver;
}
}