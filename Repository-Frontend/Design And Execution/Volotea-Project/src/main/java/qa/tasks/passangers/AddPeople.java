package qa.tasks.passangers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static qa.userinterfaces.AddPassenger.PASSENGERS;


public class AddPeople implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PASSENGERS));
    }

    public static AddPeople addPeople (){
        return Tasks.instrumented(AddPeople.class);
    }


}