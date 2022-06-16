package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPersonalInformationPage extends PageObject{

    public static final Target INPUT_NAME = Target.the("")
            .located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target INPUT_LAST_NAME = Target.the("")
            .located(By.xpath("//*[@id=\"lastName\"]"));

    public static final Target INPUT_EMAIL = Target.the("")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target SELECT_MONTH_BIRTH = Target.the("")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target SELECT_DAY_BIRTH = Target.the("")
            .located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target SELECT_YEAR_BIRTH = Target.the("")
            .located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@class=\"btn btn-blue\"]"));
}