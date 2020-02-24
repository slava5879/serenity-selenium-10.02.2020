package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class SuccessfulLoginTest extends BaseTest {
    private String userEmail;
    private String userPassword;

    public SuccessfulLoginTest (String userEmail, String userPassword){
        this.userEmail=userEmail;
        this.userPassword=userPassword;
    }

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"sslava543@gmail.com","qwerty12345"},
                {"SSLAVA543@gmail.com","qwerty12345"}
        });
    }

    @Test
    public void successfulLogin() {
        user
                .auth()
                .login(userEmail, userPassword);
        user
                .homePage()
                .validateHomePageIsLoaded();
    }
}