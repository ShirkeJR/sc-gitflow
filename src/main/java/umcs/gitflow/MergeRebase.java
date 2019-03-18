package umcs.gitflow;

import java.util.function.Supplier;

public class MergeRebase implements Supplier<String> {

    public String get() {
        return "Merge vs rebase";
    }

}