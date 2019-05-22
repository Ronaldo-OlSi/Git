
// Extensão de um café simples sem ingredientes extras
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }
        //teste
    @Override
    public String getIngredients() {
        return "Café";
    }
}