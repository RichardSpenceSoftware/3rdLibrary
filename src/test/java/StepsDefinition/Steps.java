package StepsDefinition;

import com.softwareinstitute.training.richard.spence.Fiction1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;


class IsItDate {
    static String IsItDate(String series){
        return "2012".equals(series) ? "Pass" : "Wrong";
    }
}

public class Steps {
    Fiction1 knausguard = new Fiction1("Knausguard", "2010");
    private String Date;
    private String actualDate;

    @Given("it came out in 2010")
    public void twentyten_is_book_date() {
        Date = "2010";
    }

    @When("I ask what year it came out")
    public void is_it_the_date() {
        actualDate = knausguard.getDate();
    }

    @Then("I should be be told {string}")
    public void I_will_be_told(String yes) {
        assertEquals(Date, actualDate);
    }
}
