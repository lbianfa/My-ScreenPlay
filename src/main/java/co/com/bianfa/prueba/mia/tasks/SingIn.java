package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SingIn implements Task {

    public static SingIn singIn() {
        return Tasks.instrumented(SingIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("admin").into(Login.USERNAME),
                Enter.theValue("serenity").into(Login.PASSWORD),
                Click.on(Login.LOGINBTN)
        );
    }
}
