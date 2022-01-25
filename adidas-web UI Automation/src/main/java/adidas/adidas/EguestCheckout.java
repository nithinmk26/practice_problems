/**
 * 
 */
package adidas.adidas;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author M1056182
 *
 */
public class EguestCheckout {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1056182\\Desktop\\AUTOMATION_TEST\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.staging.adidas.pl/own-the-run-shorts/FS9807.html?forceSelSize=FS9807_310");
		driver.manage().window().maximize();
	}

	@Test
	public void testingEguestCheckout() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/div[1]/div[1]/div/label[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		Utilities.ListOfXpathAddToCart.forEach((val)->{
			driver.findElement(By.xpath(val)).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Utilities.addressData.forEach((key,val)->{
			driver.findElement(By.xpath(key)).sendKeys(val);
		});
		
		driver.findElement(By.xpath("//*[@id=\"shippingAddress-emailAddress\"]")).sendKeys(Utilities.generateEmail());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/main/div[6]/button/span")).click();
		Thread.sleep(5000);
		
		//Payment
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/main/div[2]/div[3]/div[1]/div[1]/label/span")).click();
		Thread.sleep(3000);
		Utilities.cardData.forEach((key,val)->{
			driver.findElement(By.xpath(key)).sendKeys(val);
		});
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/main/button/span")).click();
		Thread.sleep(7000);
		
		String orderNumber = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div/div[2]/div/main/div[1]/div[1]/a")).getText();
		Utilities.data.add(orderNumber);
		
		
	}
	
	@AfterMethod
	public void printingDetails() {
		Utilities.data.forEach(System.out::println);
	}
	
	
	@AfterClass
	public void closeMethod() {
		System.out.println("Quiting from Chrome...!");
		driver.quit();
	}

}
