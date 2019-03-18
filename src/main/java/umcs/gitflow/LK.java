package umcs.gitflow;

import java.util.function.Supplier;

public class LK implements Supplier<String> {

    @Override
    public String get() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    }
}