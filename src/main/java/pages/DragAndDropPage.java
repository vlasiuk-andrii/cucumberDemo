package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    private SelenideElement debitAccountDropField = $x("//h3[contains(text(),'DEBIT')]/..//h3[contains(text(),'Account')]/..//li");
    private SelenideElement debitAmountDropField = $x("//h3[contains(text(),'DEBIT')]/..//h3[contains(text(),'Amount')]/..//li");
    private SelenideElement creditAccountDropField = $x("//h3[contains(text(),'CREDIT')]/..//h3[contains(text(),'Account')]/..//li");
    private SelenideElement creditAmountDropField = $x("//h3[contains(text(),'CREDIT')]/..//h3[contains(text(),'Amount')]/..//li");
    private SelenideElement resultTable = $("div.table4_result");
    private SelenideElement dragAndDropForm = $("div.platform-content");

    private Actions actionSelenium;

    public DragAndDropPage() {
            actionSelenium = new Actions(WebDriverRunner.getWebDriver());
    }
}