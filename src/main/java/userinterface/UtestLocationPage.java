package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestLocationPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("")
            .located(By.xpath("//*[@id=\"city\"]"));

    public static final Target INPUT_ZIP_CODE_POSTAL = Target.the("")
            .located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target SELECT_COUNTRY = Target.the("")
            .located(By.xpath("//*[@class=\"ui-select-match-text pull-left\"]"));

    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]"));
}
