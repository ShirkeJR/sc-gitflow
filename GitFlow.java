import java.util.function.Supplier;

public class GitFlow {

    private static final Supplier[] SUPPLIERS = {
        new G21(),
        new G23(),
        new LoremIpsum(),
        new Woodchuck(),
        new JC(),
        new LK(),
        new GPZd(),
        new PositiveStringSupplier()
    };

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("GitFlow style!");

        for (Supplier supplier : SUPPLIERS) {
            System.out.println("--------");
            System.out.println(supplier.get());
        }
    }
}
