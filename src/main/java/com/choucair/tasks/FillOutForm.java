package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.choucair.ui.QuestionsForm;

public class FillOutForm implements Task {
    public static FillOutForm isCompleted() {
        return Tasks.instrumented(FillOutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QuestionsForm.FIRST_QUESTION),
                Click.on(QuestionsForm.SECOND_QUESTION),
                WaitUntil.the(QuestionsForm.SUBMIT_BUTTON, WebElementStateMatchers.isVisible()).forNoMoreThan(1000).milliseconds(),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.THIRD_QUESTION),
                Click.on(QuestionsForm.FOURTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.FIFTH_QUESTION),
                Click.on(QuestionsForm.SIXTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.SEVENTH_QUESTION),
                Click.on(QuestionsForm.EIGHTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.NINTH_QUESTION),
                Click.on(QuestionsForm.TENTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.ELEVENTH_QUESTION),
                Click.on(QuestionsForm.TWELFTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.THIRTEENTH_QUESTION),
                Click.on(QuestionsForm.FOURTEENTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.FIFTEENTH_QUESTION),
                Click.on(QuestionsForm.SIXTEENTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.SEVENTEENTH_QUESTION),
                Click.on(QuestionsForm.EIGHTEENTH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON),

                Click.on(QuestionsForm.NINETEENTH_QUESTION),
                Click.on(QuestionsForm.TWENTIETH_QUESTION),
                Click.on(QuestionsForm.SUBMIT_BUTTON)
        );
    }
}
