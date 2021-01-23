package fragments;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BaseFragment {

    protected SelenideElement rootElement;

    public BaseFragment() {
    }

    public boolean isRootElementDisplayed() {
        return $(rootElement).isDisplayed();
    }

}
