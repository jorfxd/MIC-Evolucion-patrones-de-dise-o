
public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Items item1 = new Items("Apple", 1.5, 10);
        Items item2 = new Items("Banana", 0.5, 5);
        Items item3 = new Items("Laptop", 1000, 1);
        item3.setCategory( "electronics");
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        boolean isMember = true; 
        boolean hasCoupon = true; 
        double total = cart.calculateTotal(isMember, hasCoupon);
        if (total < 0) {
            System.out.println("Error in calculation!");
        } 
        else {
         System.out.println("The total price is: $" + total);
            }
 }
}