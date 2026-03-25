import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testGoogleTitle() throws InterruptedException {
        System.out.println("Running LoginTest...");
        Thread.sleep(3000);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Title: " + title);
        System.out.println("change test");

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}