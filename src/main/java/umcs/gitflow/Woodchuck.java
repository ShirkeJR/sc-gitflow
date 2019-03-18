package umcs.gitflow;

import java.util.function.Supplier;

public class Woodchuck implements Supplier<String> {

    public String get() {
        return "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
    }

}