package pages;

import static com.codeborne.selenide.Selenide.title;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {
        Configuration.baseUrl = "http://demo.guru99.com";
    }

    public String getTitle(){
        return title();
    }
}
