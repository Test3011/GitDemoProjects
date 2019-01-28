import java.io.File;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {


	@Test
	public void captureScreenShots(WebDriver driver) {
		try {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File fil = shot.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(fil,
					new File("C:\\Codebase\\SeleniumAutomationProjects\\GitDemoProjects\\Screenshots\\goo.png"));

			System.out.println("Screenshot Taken...");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}

	}

}
