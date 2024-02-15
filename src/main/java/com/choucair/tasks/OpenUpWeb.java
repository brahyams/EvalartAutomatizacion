package com.choucair.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.choucair.ui.HomePage;

public class OpenUpWeb implements Task {
    private HomePage homePage;
    public static Performable theMainPage(){
        return Tasks.instrumented(OpenUpWeb.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }
}
