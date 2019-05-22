public class Main {
    public static void printInfo(Coffee c) {
        System.out.println("Custo: " + c.getCost() + "; Ingredientes: " + c.getIngredients());
    }

    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        printInfo(c);

        c = new WithMilk(c);
        printInfo(c);

        c = new WithSprinkles(c);
        printInfo(c);
    }
}