package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import steps.UserSteps;

public class BaseTest {
    @Managed(driver = "chrome")
    WebDriver webDriver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Steps
    UserSteps user;
}
