package co.com.bianfa.prueba.mia.questions;

import co.com.bianfa.prueba.mia.userinterface.BusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UnitCreated implements Question<Boolean> {

    private String unit;

    public UnitCreated(String unit) {
        this.unit = unit;
    }

    public static UnitCreated unitCreated(String unit) {
        return new UnitCreated(unit);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String successText = Text.of(BusinessUnit.RESULT_MESSAGE).viewedBy(actor).asString();
        Boolean result = this.unit.equals(successText);

        return result;

    }
}
