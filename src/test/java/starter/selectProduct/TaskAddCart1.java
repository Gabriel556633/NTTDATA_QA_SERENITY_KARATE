package starter.selectProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TaskAddCart1 implements Task {

    private WebDriver driver;
    public TaskAddCart1() {

    }

    public static Performable cart1 (){
        return  instrumented(TaskAddCart1.class);//     SERENITY PARA INFORME

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

try{
        actor.attemptsTo(
                //Enter.theValue(username).into(SelectProduct.USUARIO_FIELD),
                //Enter.theValue(password).into(SelectProduct.PASSWORD_FIELD),
                Click.on(SelectProduct.ANADIR)

        );
}catch (Exception e){
    return ;
}


    }
}
