package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Conf;

public class Browser {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\velocity\\chromedriver\\chromedriver.exe");
	WebDriver q = new ChromeDriver();
	q.manage().window().maximize();
	q.navigate().to(Conf.url1);

}}
