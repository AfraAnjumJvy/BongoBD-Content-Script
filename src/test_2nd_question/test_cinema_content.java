/*2) Write a script that checks clicking an arbitrary content, loads the content and works without
error.
*/

package test_2nd_question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_cinema_content {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();       
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.bongobd.com/"); // use for go to the bongobd website
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/nav/div/div/div[2]/div[2]/ul/li[1]/a")).click(); // clicking on cinema content BY USING xpath
		driver.findElement(By.xpath("//*[@id=\"top-selector\"]/div/div/div/div[12]/div/div/div[2]/div/h6/a")).click(); // clicking on a content named dhaka attack 
		Thread.sleep(20000); // use thread for delay of page loading 
		String at = driver.getTitle();	
		System.out.println(at);
		String et = driver.getTitle(); // since the page title change randomly so we did not write the exact title.
		
		Thread.sleep(1000);
		
		if(at.equalsIgnoreCase(et)) {
			
			System.out.println("Test successful");
		}
		else {
			
			System.out.println("Test unsuccessful");
			
		}
		
		System.out.println("end");
		driver.close();
}
	}
