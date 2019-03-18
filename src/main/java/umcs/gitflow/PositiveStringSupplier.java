package umcs.gitflow;

import java.util.function.Supplier;

public class PositiveStringSupplier implements Supplier<String> {

    public String get() {
        return "Have a nice day!";
    }
}