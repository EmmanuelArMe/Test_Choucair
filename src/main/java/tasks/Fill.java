package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.UtestInformationDevisePage;
import userinterface.UtestLocationPage;
import userinterface.UtestPersonalInformationPage;

public class Fill implements Task {
    public static Fill onThePage(){
        return Tasks.instrumented(Fill.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Emmanuel").into(UtestPersonalInformationPage.INPUT_NAME),
                Enter.theValue("Arenilla").into(UtestPersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue("prueba0001@hotmail.com").into(UtestPersonalInformationPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(UtestPersonalInformationPage.SELECT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText("4").from(UtestPersonalInformationPage.SELECT_DAY_BIRTH),
                SelectFromOptions.byVisibleText("1997").from(UtestPersonalInformationPage.SELECT_YEAR_BIRTH),
                Click.on(UtestPersonalInformationPage.NEXT_BUTTON),
                //SelectFromOptions.byVisibleText("Colombia").from(UtestLocationPage.SELECT_COUNTRY),
                Enter.theValue("Medellín").into(UtestLocationPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN),
                Enter.keyValues("050001").into(UtestLocationPage.INPUT_ZIP_CODE_POSTAL),
                Click.on(UtestLocationPage.NEXT_BUTTON),
                //SelectFromOptions.byVisibleText("Linux").from(UtestInformationDevisePage.SELECT_COMPUTER),
                SelectFromOptions.byVisibleText("Debian").from(UtestInformationDevisePage.SELECT_VERSION_COMPUTER),
                SelectFromOptions.byVisibleText("Arabic").from(UtestInformationDevisePage.SELECT_LANGUAGE_COMPUTER),
                SelectFromOptions.byVisibleText("Huawei").from(UtestInformationDevisePage.SELECT_MOBILE_DEVISE),
                SelectFromOptions.byIndex(1).from(UtestInformationDevisePage.SELECT_MODEL_DIVESE),
                SelectFromOptions.byIndex(1).from(UtestInformationDevisePage.SELECT_SO),
                Click.on(UtestInformationDevisePage.NEXT_BUTTON)
        );
    }
}
