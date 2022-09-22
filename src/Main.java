public class Main {
    public static void main(String[] args) {
        double itemPrice = 101;
        double shippingPrice = 0.02 * itemPrice;
        double totalCost = itemPrice + shippingPrice;
        if (itemPrice >= 100) {
            System.out.println("Your item price is " + itemPrice + " Your shipping is free! Your cost is: " + itemPrice);
        } else {
            System.out.println("Your item price is " + itemPrice + " You have to pay for shipping... your cost is " + totalCost);
        }
    }
}