package qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static qa.userinterfaces.EnterCities.VALIDATE_ORIGIN;


public class Origin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_ORIGIN), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_ORIGIN).viewedBy(actor).asString();
    }

    public static Origin message() {
        return new Origin();
    }

}