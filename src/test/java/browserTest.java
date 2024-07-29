import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserTest {
	public static void main(String[] args) {
		googleSearch();

	}

	public static void googleSearch() {

		// opening of the google search
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Enter text on google search box
		driver.findElement(By.name("q")).sendKeys("automation Step by Step");
		
		// click on search button
		// driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// closing browser
		driver.close();

		System.out.println("Test completed successfully");
	}

}
