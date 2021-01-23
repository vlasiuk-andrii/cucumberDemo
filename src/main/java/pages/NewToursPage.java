package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import fragments.MainMenuFragment;
import org.openqa.selenium.support.FindBy;

public class NewToursPage extends BasePage {

    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement mainFragment = $("body>div>table");

    public NewToursPage(){
    }

    public MainMenuFragment getMainMenuFragment(){
        return mainMenuFragment;
    }

  public boolean isMainFragmentPresent() {
    return mainMenuFragment.getRootElement().isDisplayed();
  }
}
