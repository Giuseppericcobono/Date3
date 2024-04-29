//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        System.out.println("Anno: " + anno);

        Month mese = data.getMonth();
        System.out.println("Mese: " + mese);

        Integer giorno = data.getDayOfMonth();
        System.out.println("Giorno: " + giorno);

        DayOfWeek giornoSettimana = data.getDayOfWeek();
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}
