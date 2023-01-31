package Pages;

import Base.BaseStepMethod;
import org.openqa.selenium.By;

public class LoginPage extends BaseStepMethod {
    //https://www.automatedtestingwithtuyen.com/post/page-object-model-pattern

    private static final By INPUT_LOGINPAGE_EMAIL =By.id("txtUserName");
    private static final By BTN_LOGINPAGE_LOGINBUTON1=By.id("btnLogin");
    private static final By INPUT_LOGINPAGE_PASSWORD=By.xpath("//input[@placeholder='Şifre']");
    private static final By BTN_LOGINPAGE_LOGINBUTTON2=By.id("btnEmailSelect");



    public void loginHepsiBurada(String email,String password){
        setTextElement(INPUT_LOGINPAGE_EMAIL,email);
        clickElement(BTN_LOGINPAGE_LOGINBUTON1);
        setTextElement(INPUT_LOGINPAGE_PASSWORD,password);
        clickElement(BTN_LOGINPAGE_LOGINBUTTON2);


    }


}
