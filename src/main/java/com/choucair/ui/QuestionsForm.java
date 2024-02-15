package com.choucair.ui;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class QuestionsForm extends PageObject {

    //Ciclo 1
    public static final Target FIRST_QUESTION = Target.the("First question")
            .locatedBy("//*[@value='-13034895']");
    public static final Target SECOND_QUESTION = Target.the("Second question")
            .locatedBy("//input[@value='70653']");

    //Ciclo 2
    public static final Target THIRD_QUESTION = Target.the("Third question")
            .locatedBy("//*[@value='-813395']");
    public static final Target FOURTH_QUESTION = Target.the("Fourth question")
            .locatedBy("//input[@value='-32526']");

    //Ciclo 3
    public static final Target FIFTH_QUESTION = Target.the("Fifth question")
            .locatedBy("//*[@value='-107752']");
    public static final Target SIXTH_QUESTION = Target.the("Sixth question")
            .locatedBy("//input[@value='53343']");

    //Ciclo 4
    public static final Target SEVENTH_QUESTION = Target.the("Seventh question")
            .locatedBy("//*[@value='2380']");
    public static final Target EIGHTH_QUESTION = Target.the("Eighth question")
            .locatedBy("//input[@value='118384470']");

    //Ciclo 5
    public static final Target NINTH_QUESTION = Target.the("Ninth question")
            .locatedBy("//*[@value='15743665']");
    public static final Target TENTH_QUESTION = Target.the("Tenth question")
            .locatedBy("//input[@value='1181068447246']");

    //Ciclo 6
    public static final Target ELEVENTH_QUESTION = Target.the("Eleventh question")
            .locatedBy("//*[@value='-1505616']");
    public static final Target TWELFTH_QUESTION = Target.the("Twelfth question")
            .locatedBy("//input[@value='10071504']");

    //Ciclo 7
    public static final Target THIRTEENTH_QUESTION = Target.the("Thirteenth question")
            .locatedBy("//*[@value='8098']");
    public static final Target FOURTEENTH_QUESTION = Target.the("Fourteenth question")
            .locatedBy("//input[@value='-75']");

    //Ciclo 8
    public static final Target FIFTEENTH_QUESTION = Target.the("Fifteenth question")
            .locatedBy("//*[@value='20056']");
    public static final Target SIXTEENTH_QUESTION = Target.the("Sixteenth question")
            .locatedBy("//input[@value='252040796']");

    //Ciclo 9
    public static final Target SEVENTEENTH_QUESTION = Target.the("Seventeenth question")
            .locatedBy("//*[@value='-68434']");
    public static final Target EIGHTEENTH_QUESTION = Target.the("Eighteenth question")
            .locatedBy("//input[@value='-37131']");

    //Ciclo 10
    public static final Target NINETEENTH_QUESTION = Target.the("Nineteenth question")
            .locatedBy("//*[@value='18819']");
    public static final Target TWENTIETH_QUESTION = Target.the("Twentieth question")
            .locatedBy("//input[@value='42511']");

    //Submit
    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .locatedBy("//*[@type='submit']");

    //Hashcode
    public static final Target HASHCODE = Target.the("Hashcode")
            .locatedBy("//p[@class='text-white text-2xl text-center break-all']");

}
