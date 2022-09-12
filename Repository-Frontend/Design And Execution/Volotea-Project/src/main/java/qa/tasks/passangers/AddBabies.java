package qa.tasks.passangers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static qa.userinterfaces.AddPassenger.ADD_BABIES;

public class AddBabies implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADD_BABIES));
    }

    public static AddBabies addBabies (){
        return Tasks.instrumented(AddBabies.class);
    }
}