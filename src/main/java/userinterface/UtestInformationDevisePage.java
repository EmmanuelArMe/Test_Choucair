package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestInformationDevisePage extends PageObject {

    public static final Target SELECT_COMPUTER = Target.the("")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_VERSION_COMPUTER = Target.the("")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_LANGUAGE_COMPUTER = Target.the("")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));

    public static final Target SELECT_MOBILE_DEVISE= Target.the("")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target SELECT_MODEL_DIVESE= Target.the("")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));

    public static final Target SELECT_SO = Target.the("")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]"));

}
