package co.com.bianfa.prueba.mia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegionsModule extends PageObject {

    public static final Target NORTHWIND_BTN = Target.the("NorthwindBtn")
            .located(By.xpath("//*[@id=\"nav_menu1_2\"]/li[1]/a"));

    public static final Target REGIONS_BTN = Target.the("RegionsBtn")
            .located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[7]/a"));

}
