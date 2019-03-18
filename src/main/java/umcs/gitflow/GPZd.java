package umcs.gitflow;

import java.util.function.Supplier;

public class GPZd implements Supplier<String> {

    public String get() {
        return "GPZd. Zrozumienie algorytmu\n" +
               "Dzieki temu, ze ludzie nie poswiecaja czasu na zrozumienie algorytmu, powstalo wiele smiesznego kodu.\n" +
               "Probuja oni uzyskac jakiekolwiek wyniki przez dodawanie odpowiedniej liczby instrukcji if oraz znacznikow,\n" +
               "zamiast zatrzymac sie i sprawdzic, co naprawde powinni zrobic.";
    }

}