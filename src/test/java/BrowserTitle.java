import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTitle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title " + title);
		driver.close();

	}

}
