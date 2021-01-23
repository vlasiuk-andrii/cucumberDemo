package fragments;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MainMenuFragment extends BaseFragment {

    protected SelenideElement rootElement = $("div.row>nav");

    public MainMenuFragment() {
        super.rootElement = rootElement;
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }


}
