/**
 * 
 */
package tesing_start.testing_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author M1056182
 *
 */
public class shoppingCart {
	
	public WebDriver driver;
	static String validMessagePath = "//*[@id=\\\"container\\\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[2]/div[1]/ul/div/div";
	static String invalidMessagePath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[2]/div";
	
	public void testing() throws InterruptedException {
		
		//Adding driver to System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1056182\\Desktop\\AUTOMATION_TEST\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//closing the login window
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iphone xr");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();

		Thread.sleep(4000);
		
		String nextWindowHAndle = null;
		
		String currentWindowHandle = driver.getWindowHandle();
		
		for (String nextWindowHandle : driver.getWindowHandles()) {
            if (!nextWindowHandle.equalsIgnoreCase(currentWindowHandle))
            	driver.switchTo().window(nextWindowHandle);
            nextWindowHAndle = nextWindowHandle;
        }
		
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"swatch-0-color\"]/a/div")).click();
		
		Thread.sleep(5000);
		
		String resultMessage = pinCodeVarifier("577100");
		System.out.println(resultMessage);
		
		Thread.sleep(2000);
		if(resultMessage.equalsIgnoreCase("Not a valid pincode")) {
			System.out.println("Entering Valid pincode..!!!");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[1]/div[2]/div/div[2]/div/span")).click();
			Thread.sleep(1000);
			for (int i = 0; i < 6; i++) {
				driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys(Keys.SPACE, Keys.BACK_SPACE);
			}
			String secndResult = pinCodeVarifier("577116");
			System.out.println(secndResult);
			
			//Add to cart 
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
			Thread.sleep(5000);
			
			//Place Order
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("9113683980");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("Cloud@541");;
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"CNTCT64F059F020F8404B92B754BC3\"]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();

			
			

			
			
			
		}
		Thread.sleep(5000);
//		driver.close();
//		driver.switchTo().window(currentWindowHandle);
//		driver.close();
//		driver.quit();
	}
	
	
	public String pinCodeVarifier(String pinCode) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys(pinCode);
		System.err.println("**************************"+pinCode);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")).click();
		Thread.sleep(1000);
		return driver.findElement(By.xpath(invalidMessagePath)).getText();
	}
	
}
