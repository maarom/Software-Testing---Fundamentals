package junit;

public class OrderCalculatorV2 {

    public double calculateTotal(double itemPrice, int itemCount, double taxRate, double discount, double discountThreshold) {
        double totalPrice = itemPrice * itemCount;

        totalPrice *= (1+taxRate);

        // discount
        if(totalPrice > discountThreshold) {
            totalPrice -= discount;
        }


        return totalPrice;
    }

    public static void main(String[] args) {
        OrderCalculatorV2 calculatorV2 = new OrderCalculatorV2();
        double total = calculatorV2.calculateTotal(100,3,0.1,50, 200);
        System.out.println("Total price: " + total);
    }

}
