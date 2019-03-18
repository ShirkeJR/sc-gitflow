package umcs.gitflow;

import java.util.function.Supplier;

public class LoremIpsum implements Supplier<String> {

    public String get() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n" +
			   "incididunt ut labore et dolore magna aliqua.";
    }

}