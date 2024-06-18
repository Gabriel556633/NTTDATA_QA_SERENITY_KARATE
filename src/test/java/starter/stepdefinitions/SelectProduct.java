package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import starter.DashBoard.Quetion1;
import starter.navigation.NavigateTo;
import starter.selectProduct.*;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class SelectProduct {

    String name = "Gabriel";
    DesiredCapabilities cap = DesiredCapabilities.chrome();


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Ricardo is on the demoblaze home page")
    public void ricardo_is_on_the_demoblaze_home_page() {
        this.name=name;
    }

    @When("He select a two product and buy")
    public void he_select_a_two_product_and_buy() {
        cap. setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        theActorCalled(name).attemptsTo(
                NavigateTo.demoblazeHomePage(),
                TaskDoSelectProduct.selectProduct(),
                TaskAddCart1.cart1(),
                NavigateTo.demoblazeHomePage(),
                TaskDoSelectProduct2.selectProduct(),
                TaskAddCart1.cart1(),
                TaskGoCart.cart1(),
                TaskDoOrder.selectProduct()
        );

    }



    @Then("Buy is successful")
    public void buy_is_successful() {
        System.out.println("DATOS DE VENTA : : "+ Quetion1.venta().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("El valor debe ser: ",Quetion1.venta(),equalTo("INFO"))
        );
    }

}
