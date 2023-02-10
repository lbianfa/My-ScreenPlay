package co.com.bianfa.prueba.mia.questions;

import co.com.bianfa.prueba.mia.userinterface.RegionsSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegionCreated implements Question<Boolean> {

    private String region;

    public RegionCreated(String region) {
        this.region = region;
    }

    public static RegionCreated regionCreated(String region) {
        return new RegionCreated(region);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String successText = Text.of(RegionsSection.RESULT_MESSAGE).viewedBy(actor).asString();
        Boolean result = this.region.equals(successText);

        return result;

    }

}
