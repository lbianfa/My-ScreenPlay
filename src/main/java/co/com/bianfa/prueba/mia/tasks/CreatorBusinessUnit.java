package co.com.bianfa.prueba.mia.tasks;

import co.com.bianfa.prueba.mia.userinterface.BusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class CreatorBusinessUnit implements Task {

    public static CreatorBusinessUnit creatorBusinessUnit() {
        return Tasks.instrumented(CreatorBusinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BusinessUnit.NEW_BUSINESS_UNIT_BTN),
                Enter.theValue("Mi unidad 3").into(BusinessUnit.NAME_INPUT),
                Click.on(BusinessUnit.SELECT_UNIT),
                Enter.theValue("Administration").into(BusinessUnit.SELECT_INPUT),
                Hit.the(Keys.ENTER).into(BusinessUnit.SELECT_INPUT),
                Click.on(BusinessUnit.APPLY_CHANGE)
        );
    }
}
