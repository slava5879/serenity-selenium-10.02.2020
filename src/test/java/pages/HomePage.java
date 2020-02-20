package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath="//div[@data-control-name='identity_welcome_message']")
    private WebElement welcomeMessage;

    public String getWelcomeMessageText(){
        return welcomeMessage.getText();
    }
}
