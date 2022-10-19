package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\gciurescu\\Downloads\\repos\\personal\\Selenium\\Sal Course\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/buttons.html");
		
		System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
		
		System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());
		
	}

}
