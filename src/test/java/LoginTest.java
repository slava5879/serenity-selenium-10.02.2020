import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed (driver = "chrome")
    WebDriver webDriver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Steps
    UserSteps userSteps;

    @Test
    public void negativeLoginTest(){
        webDriver.get("https://www.linkedin.com/");
        userSteps.login("aghfh@eee.io", "password123");
    }
}
