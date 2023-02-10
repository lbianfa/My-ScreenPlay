package co.com.bianfa.prueba.mia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegionsSection extends PageObject {

    public static final Target NEW_REGION_BTN = Target.the("NewRegionBtn")
            .located(By.xpath("//span[text()=' New Region']"));

    public static final Target REGION_ID_INPUT = Target.the("RegionIdInput")
            .located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_RegionDialog4_RegionID\"]"));

    public static final Target REGION_DESCRIPTION_INPUT = Target.the("RegionDescriptionInput")
            .located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_RegionDialog4_RegionDescription\"]"));

    public static final Target APPLY_CHANGE = Target.the("applyChange")
            .located(By.className("apply-changes-button"));

    public static final Target RESULT_MESSAGE = Target.the("resultMessage")
            .located(By.xpath("//*[@id=\"toast-container\"]/div/div"));

}
