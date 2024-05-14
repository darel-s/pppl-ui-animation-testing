import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
    @Test
    public void Test() {
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://sv.ugm.ac.id/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}