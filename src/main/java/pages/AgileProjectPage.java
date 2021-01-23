package pages;


import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import fragments.AgileProjectMenuFragment;
import fragments.AgileProjectTableFragment;
import org.openqa.selenium.support.FindBy;

public class AgileProjectPage extends BasePage {

    protected AgileProjectMenuFragment agileProjectMenuFragment = new AgileProjectMenuFragment();
    protected AgileProjectTableFragment agileProjectTableFragment = new AgileProjectTableFragment();

    private SelenideElement userInput = $("input[name='uid']");
    private SelenideElement passwordInput = $("input[name='password']");
    private SelenideElement logInButton = $("input[name='btnLogin']");
    private SelenideElement customerMenu = $("ul.menusubnav");
    private SelenideElement welcomeMessage = $("marquee");

    public AgileProjectPage() {
    }

    public AgileProjectMenuFragment getAgileProjectMenuFragment() {
        return agileProjectMenuFragment;
    }

    public AgileProjectTableFragment getAgileProjectTableFragment() {
        return agileProjectTableFragment;
    }
}
