package DateBasics;
import java.time.LocalDateTime;

public class DateExample {
    public static void main(String[] args) {

// 1. Ottenere data e ora attuali

        LocalDateTime adesso = LocalDateTime.now();
        System.out.println("Data e ora attuali: " + adesso);

// 2. Data di domani (+1 giorno)

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Data di domani: " + today.plusDays(1));

// 3. Data di una settimana fa (-7 giorni)

        LocalDateTime settimanaFa = LocalDateTime.now();
        System.out.println("Data di una settimana fa: " + today.minusWeeks(1) );

// 4. Data fra 100 giorni (+100 giorni)

        LocalDateTime fraCentoGiorni = LocalDateTime.now();
        System.out.println("Data fra 100 giorni: " + today.plusDays(100));
    }
}