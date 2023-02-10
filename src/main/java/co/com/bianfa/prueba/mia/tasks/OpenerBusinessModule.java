package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.OrgModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenerBusinessModule implements Task {

    public static OpenerBusinessModule openerBusinessModule() {
        return Tasks.instrumented(OpenerBusinessModule.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrgModule.ORGANIZATION),
                Click.on(OrgModule.BUSINESS_UNIT)
        );
    }
}
