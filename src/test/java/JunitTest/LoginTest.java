package JunitTest;

import Page.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginTest {
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        LoginPage login = new LoginPage(driver);

        login.inputUsername("standard_user");
        login.inputPassword("secret_sauce");
        login.clickLoginButton();

        Thread.sleep(2000);
    }
}