package starter.loggin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TaskDoLogin implements Task {

    private final String username;
    private final String password;

    public TaskDoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable conCredenciales (String username, String password){
        return  instrumented(TaskDoLogin.class,username,password);//     SERENITY PARA INFORME

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USUARIO_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGI_BUTTON)
        );

    }
}
