import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;

public class MainTest {

    Main testing = new Main();
    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    public void dataFormattedFULL() {
        String risultato1 = testing.dataFormattedFULL(data);
        assertEquals("venerdì 1 marzo 2002", risultato1, "è il primo risultato");
    }

    @Test
    public void dataFormattedMEDIUM() {
        String risultato2 = testing.dataFormattedMEDIUM(data);
        assertEquals("1 mar 2002", risultato2, "è il secondo risultato");
    }

    @Test
    public void dataFormattedSHORT() {
        String risultato3 = testing.dataFormattedSHORT(data);
        assertEquals("01/03/02", risultato3, "è il terzo risultato");

    }
}

