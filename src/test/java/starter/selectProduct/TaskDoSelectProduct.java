package starter.selectProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TaskDoSelectProduct implements Task {


    public TaskDoSelectProduct() {

    }

    public static Performable selectProduct (){
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        return  instrumented(TaskDoSelectProduct.class);//     SERENITY PARA INFORME

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
        try{
            actor.attemptsTo(
                    //Enter.theValue(username).into(SelectProduct.USUARIO_FIELD),
                    //Enter.theValue(password).into(SelectProduct.PASSWORD_FIELD),
                    Click.on(SelectProduct.PRODUCT1)
            );
        }catch (Exception e){
            return;
        }

    }
}
