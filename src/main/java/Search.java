import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import javax.lang.model.element.Element;

public class Search {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("http://www.google.com/");
        Thread.sleep(2000);
        WebElement searchBox = chromeDriver.findElement(By.className("gLFyf"));
        WebElement searchButton = chromeDriver.findElement(By.className("gNO89b"));
        searchBox.sendKeys("godot");
        Thread.sleep(2000);
        searchButton.submit();
        Thread.sleep(5000);
        chromeDriver.quit();
    }
}
