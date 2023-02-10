package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.SerenityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenerSerenity implements Task {

    private SerenityPage myPage;

    public static OpenerSerenity openerSerenity() {
        return Tasks.instrumented(OpenerSerenity.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(myPage));
    }
}
