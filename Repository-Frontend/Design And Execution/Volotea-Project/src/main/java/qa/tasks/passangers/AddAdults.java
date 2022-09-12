package qa.tasks.passangers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static qa.userinterfaces.AddPassenger.ADD_ADULTS;


public class AddAdults implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADD_ADULTS));
    }

    public static AddAdults addAdults (){
        return Tasks.instrumented(AddAdults.class);
    }
}
