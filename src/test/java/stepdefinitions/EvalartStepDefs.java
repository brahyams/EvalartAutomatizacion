package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import com.choucair.questions.HashcodeQuestion;
import com.choucair.tasks.FillOutForm;
import com.choucair.tasks.Login;
import com.choucair.tasks.OpenUpWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class EvalartStepDefs {

    @Given("{actor} is on Evalart Home Page")
    public void thatAnUserIsOnEvalartHomePage(Actor actor) {
        actor.wasAbleTo(
                OpenUpWeb.theMainPage()
        );
    }

    @When("{actor} logs with correct credentials")
    public void heLogsWithCorrectCredentials(Actor actor) {
        actor.attemptsTo(Login.onThePage()
        );
    }

    @And("{actor} completes the math operations form")
    public void heCompletesTheMathOperationsForm(Actor actor) {
        actor.attemptsTo(
                FillOutForm.isCompleted()
        );
    }

    @Then("{actor} retrieve the hashcode")
    public void heRetrieveTheHashcode(Actor actor) {
        actor.should(seeThat(HashcodeQuestion.isShown(), equalTo(true)));
    }

}
