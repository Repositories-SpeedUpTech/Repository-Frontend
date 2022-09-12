package qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPassenger {
    public static final Target ACCEPT_COOKIES = Target
            .the("press the button to accept cookies ")
            .located(By.id("onetrust-accept-btn-handler"));

    public static final Target PASSENGERS = Target
            .the("Click on the passenger field")
            .located(By.id("input-text_sf-passenger"));

    public static final Target ADD_ADULTS = Target
            .the("Clicking on the plus button increases the adults by one")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[1]"));

    public static final Target ADD_CHILDREN = Target
            .the("Clicking on the plus button increases the children by one")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target ADD_BABIES = Target
            .the("Clicking on the plus button increases the babies by one")
            .located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[3]"));

}
