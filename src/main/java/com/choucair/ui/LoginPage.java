package com.choucair.ui;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("Insert the username")
            .locatedBy("//*[@placeholder='Usuario ']");
    public static final Target PASSWORD = Target.the("Insert the password")
            .locatedBy("//*[@placeholder='Contraseña ']");
    public static final Target LOGIN_BUTTON = Target.the("Click button login")
            .locatedBy("//*[@type='submit']");
}
