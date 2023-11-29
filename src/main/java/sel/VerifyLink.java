package sel;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLink {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenlink = 0;
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("this is a empty lik");
				continue;

			}

			try {
				URL my = new URL(url);

				HttpURLConnection conn = (HttpURLConnection) my.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(conn.getResponseCode() + "it is broken link");
					brokenlink++;

				} else {
					System.out.println(conn.getResponseCode() + "this is a valid link");
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

		System.out.println(brokenlink);

	}

}
