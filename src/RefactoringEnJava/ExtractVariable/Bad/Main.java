package RefactoringEnJava.ExtractVariable.Bad;

public class Main {

    void printProductPrice(Order order){
        Double totalPrice = order.getPrice() * order.getQuantity() - order.getOffer() + order.getShipping() * 2;

        System.out.println(totalPrice);

    }
}
