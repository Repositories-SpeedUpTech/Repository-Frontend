package qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterCities {


    public static final Target FIRST_ORIGIN = Target
            .the("Origin is entered(city)")
            .located(By.xpath("(//label[@for='input-text_sf-origin'])"));
    public static final Target ORIGIN = Target
            .the("Origin is entered(city)")
            .located(By.xpath("(//input[@id='origin'])"));

    public static final Target DESTINATION = Target
            .the("Destination is entered(city")
            .located(By.xpath("//input[@id='destination']"));

    public static final Target VALIDATE_ORIGIN = Target
            .the("Origin is entered(city)")
            .located(By.xpath("(//h3[@class='v7-route__info-title || v7-main-title v7-main-title--md'])"));

    public static final Target VALIDATE_DESTINATION = Target
            .the("Origin is entered(city)")
            .located(By.className("v7-route__info-title"));





}
