import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\workspace\\UsingJenkins\\Lib\\geckodriver.exe");
		WebDriver obj = new FirefoxDriver();
		
		obj.get("http://demo.oscommerce.com");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj.findElement(By.linkText("log your self in ")).click();
		System.out.println("executed");
		obj.quit();
	}

}
