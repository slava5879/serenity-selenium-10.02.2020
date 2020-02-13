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
    UserSteps user;

    @Test
    public void negativeLoginTest(){
        user
            .login("aghfh@eee.io", "password123")
            .validatePageHeader(
                "Don't miss your next opportunity. Sign in to stay updated on your professional world.");
    }
}
