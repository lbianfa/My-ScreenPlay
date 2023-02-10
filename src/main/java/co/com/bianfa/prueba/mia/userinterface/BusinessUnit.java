package co.com.bianfa.prueba.mia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnit extends PageObject {

    public static final Target NEW_BUSINESS_UNIT_BTN = Target.the("newBusinessBtn")
            .located(By.xpath("//span[text()=' New Business Unit']"));

    public static final Target NAME_INPUT = Target.the("nameInput")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));

    public static final Target SELECT_UNIT = Target.the("selectUnit")
            .located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId\"]"));

    public static final Target SELECT_INPUT = Target.the("selectInput")
            .located(By.xpath("//*[@id=\"s2id_autogen1_search\"]"));

    public static final Target APPLY_CHANGE = Target.the("applyChange")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[2]"));

    public static final Target RESULT_MESSAGE = Target.the("resultMessage")
            .located(By.xpath("//*[@id=\"toast-container\"]/div/div"));
}
