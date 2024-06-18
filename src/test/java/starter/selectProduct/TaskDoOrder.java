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

public class TaskDoOrder implements Task {


    public TaskDoOrder() {

    }

    public static Performable selectProduct (){
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        return  instrumented(TaskDoOrder.class);//     SERENITY PARA INFORME

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
        try{
                actor.attemptsTo(
                        Click.on(SelectProduct.ORDER),
                        Enter.theValue("Gabriel Borja").into(SelectProduct.NAME),
                        Enter.theValue("Ecuador").into(SelectProduct.COUNTRY),
                        Enter.theValue("Quito").into(SelectProduct.CITY),
                        Enter.theValue("1720445715").into(SelectProduct.CITY),
                        Enter.theValue("JUNIO").into(SelectProduct.CITY),
                        Enter.theValue("2024").into(SelectProduct.CITY),
                        Enter.theValue("Quito").into(SelectProduct.CITY),
                        Click.on(SelectProduct.PURCHASE)

                );
        }catch (Exception e){
            return;
        }

    }
}
