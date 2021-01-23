package steps;

import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class TableSteps implements En {

  public TableSteps() {
    Given("^I open my application$", () -> {
      System.out.println("step1");
    });
    And("^I login with following credentials$", (DataTable dt) -> {
      List<String> list = dt.asList();
      System.out.println(list.get(0));
      System.out.println(list.get(1));
    });
    And("^I use data$", (DataTable dt) -> {
      List<Map<String, String>> list = dt.asMaps(String.class, String.class);
      System.out.println(list.get(0).get("First Name"));
      System.out.println(list.get(0).get("Last Name"));
      System.out.println(list.get(0).get("Phone No"));
    });
  }
}
