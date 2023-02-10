package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.RegionsModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenerRegionsModule implements Task {

    public static OpenerRegionsModule openerRegionsModule() {
        return Tasks.instrumented(OpenerRegionsModule.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegionsModule.NORTHWIND_BTN),
                Click.on(RegionsModule.REGIONS_BTN)
        );
    }
}
