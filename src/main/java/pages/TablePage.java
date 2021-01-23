package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import fragments.MainMenuFragment;
import org.openqa.selenium.support.FindBy;

public class TablePage extends BasePage {

    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement table = $("table>tbody");

    public TablePage(){
    }

    public MainMenuFragment getMainMenuFragment(){
        return mainMenuFragment;
    }
}