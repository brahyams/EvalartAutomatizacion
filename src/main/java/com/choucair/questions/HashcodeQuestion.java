package com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.choucair.ui.QuestionsForm;

public class HashcodeQuestion implements Question<Boolean> {

    public static HashcodeQuestion isShown() {
        return new HashcodeQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(QuestionsForm.HASHCODE).answeredBy(actor).toString().contains("<General>c2fe0e21ce445033MS00LTk3NDY4Nw==df63afbf4da3d4b1");
    }
}
