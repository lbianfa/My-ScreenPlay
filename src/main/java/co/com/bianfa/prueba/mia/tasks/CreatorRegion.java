package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.RegionsSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreatorRegion implements Task {

    public static CreatorRegion creatorRegion() {
        return Tasks.instrumented(CreatorRegion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegionsSection.NEW_REGION_BTN),
                Enter.theValue("10").into(RegionsSection.REGION_ID_INPUT),
                Enter.theValue("Mi región").into(RegionsSection.REGION_DESCRIPTION_INPUT),
                Click.on(RegionsSection.APPLY_CHANGE)
        );
    }
}
