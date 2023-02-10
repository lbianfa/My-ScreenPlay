package co.com.bianfa.prueba.mia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrgModule extends PageObject {

    public static final Target ORGANIZATION = Target.the("organizationBtn")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a"));

    public static final Target BUSINESS_UNIT = Target.the("bisnessUnit")
            .located(By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a"));

}
