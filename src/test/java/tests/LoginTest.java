package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest{

    @Test
    public void negativeLoginTest(){
        user
            .login("sslava543@gmail.com", "qwerty123456")
            .validatePageHeader(
                "Don't miss your next opportunity. Sign in to stay updated on your professional world.");
    }

    @Test
    public void positiveLoginTest(){
        user
                .login("sslava543@gmail.com", "qwerty12345")
                .validateWelcomeMessage("Welcome, Viacheslav!");

    }
}
