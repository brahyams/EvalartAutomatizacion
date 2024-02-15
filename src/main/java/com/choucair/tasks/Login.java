package com.choucair.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.choucair.ui.LoginPage;

public class Login implements Task {
    public static Performable onThePage(){
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.LOGIN_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(5000).milliseconds(),
                DoubleClick.on(LoginPage.USERNAME),
                SendKeys.of("786479").into(LoginPage.USERNAME),
                WaitUntil.the(LoginPage.LOGIN_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(1000).milliseconds(),
                DoubleClick.on(LoginPage.PASSWORD),
                SendKeys.of("10df2f32286b7120MS00LTk3NDY4Nw==30e0c83e6c29f1c3").into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON));
    }
}
