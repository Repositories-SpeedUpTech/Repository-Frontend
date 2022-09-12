package qa.tasks.cities;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.tools.ant.filters.TokenFilter;
import org.apache.tools.ant.taskdefs.Delete;
import qa.models.Origin;

import static qa.userinterfaces.EnterCities.*;


public class CityOfOrigin implements Task {

    private Origin origin;

    public CityOfOrigin(Origin origin) {
        this.origin = origin;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FIRST_ORIGIN));
        actor.attemptsTo(Click.on(ORIGIN));
        actor.attemptsTo(Enter.theValue(origin.getOriginCity()).into(ORIGIN));

    }

    public static CityOfOrigin cityOfOrigin (Origin origin){
        return new CityOfOrigin(origin);

    }
}
