
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * A simple junit test. Open and url with Firefox browser and get's site title.
 *
 * @author love.nyberg@lovemusic.se
 */
public class testDriver {

	@Test
	public void startSite() {
		String url = "https://lovemusic.se";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suhai\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("The title of " + url + " is: " + title);
		driver.quit();
	}
}
