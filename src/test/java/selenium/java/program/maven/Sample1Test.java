package selenium.java.program.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample1Test{
	@Test
	public void sample1() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.firstcry.com");
		Thread.sleep(3000);
		driver.quit();
	}
	}



