package junit;

public class OrderCalculatorV2 {

    public double calculateTotal(double itemPrice, int itemCount, double taxRate, double discount) {
        double totalPrice = itemPrice * itemCount;
        //tax
        totalPrice *= (1 + taxRate);

        // discount
        totalPrice -= discount;

        return totalPrice;
    }

    public static void main(String[] args) {
        OrderCalculatorV2 calculator = new OrderCalculatorV2();
        double total = calculator.calculateTotal(100,3,0.1,50);
        System.out.println("Total price: " + total);
    }

}
