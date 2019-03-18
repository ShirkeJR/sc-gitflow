package umcs.gitflow;

import java.util.function.Supplier;

public class JC implements Supplier<String> {

    @Override
    public String get() {
        return "Cowards die many times before their deaths; the valiant never taste of death but once.";
    }
}
