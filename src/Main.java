//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
// Stampa le varie versioni -Crea dei test per questo esercizio


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static String dataFormattedFULL(OffsetDateTime data) {
        String dataFormattata1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return dataFormattata1;
    }

    public static String dataFormattedMEDIUM(OffsetDateTime data) {
        String dataFormattata2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return dataFormattata2;
    }

    public static String dataFormattedSHORT(OffsetDateTime data) {
        String dataFormattata3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return dataFormattata3;
    }

    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("dataFormattata1: " + dataFormattedFULL(data));
        System.out.println("dataFormattata2: " + dataFormattedMEDIUM(data));
        System.out.println("dataFormattata3: " + dataFormattedSHORT(data));
    }
}





