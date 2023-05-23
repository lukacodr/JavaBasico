package TecnicasRefactorizacion.ReplaceMethod.Good;

/**
 * Tecnica de refactoring para componer metodos
 * (Composing Methods)
 *
 * Replace method with method object
 */
public class Product {

    private double price;
    private int quantity;
    private double discount;
    private double shipping;

    //metodos especiales

    double calculatePrice(){
        // ProductPriceCalculator calculator = new ProductPriceCalculator(this);
        // return calculator.calculatorPrice();

        return new ProductPriceCalculator(this).calculatePrice();
    }

    // getter y setter
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getDiscount() { return discount; }

}
