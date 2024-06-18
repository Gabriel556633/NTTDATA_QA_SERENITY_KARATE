package starter.DashBoard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class Quetion1  {
    public static Question<String> venta() {
        return actor-> TextContent.of(ObtenerInformacion.INFOSALE).viewedBy(actor).asString();
    }
}
