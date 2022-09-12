package qa.tasks.cities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import qa.models.Destination;
import qa.models.Origin;

import static qa.userinterfaces.EnterCities.DESTINATION;
import static qa.userinterfaces.EnterCities.ORIGIN;

public class CityOfDestination implements Task {

    private Destination destination;

    public CityOfDestination(Destination destination) {
        this.destination = destination;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DESTINATION));
        actor.attemptsTo(Enter.theValue(destination.getDestinationCity()).into(DESTINATION));
    }

    public static CityOfDestination cityOfDestination (Destination destination){
        return new CityOfDestination(destination);

    }
}
