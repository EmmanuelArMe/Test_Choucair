package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestLoginPage;

public class Login implements Task {

    public static Login onThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON)
                /**Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)*/
        );
    }
}
