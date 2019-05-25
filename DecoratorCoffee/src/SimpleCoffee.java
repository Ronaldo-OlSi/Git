
// Extensão de um café simples sem ingredientes extras
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Café";
    }
}