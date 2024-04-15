import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetStepDef {
    WebDriver driver = new ChromeDriver();

    @Given("user is on login page reset")
    public void userIsOnLoginPageReset() {

        driver.get("https://www.saucedemo.com/");
    }
}

