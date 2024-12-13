import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

        List<Items> items;
        static final double TAXRATE = 0.08;
        static final double MEMBERDISCOUNT = 0.05;
        static final double BIGSPENDERDISCOUNT = 10;
        static final double COUPONDISCOUNT = 0.15;
        static final String CURRENCY = "USD";
        static final double ENVFEE = 5;

        ShoppingCart() {
            items = new ArrayList<>();
        }

        void addItem(Items item) {
            items.add(item);
        }

        double calculateSubtotal() {
            double subtotal = 0;
            for (Items item : items) {
             subtotal += item.getTotal();
             if (item.getCategory().equals("electronics")){
                subtotal += ENVFEE;
             }
            }
            return subtotal;
        }


        double applyDiscounts(double subtotal, boolean isMember) {
            if (isMember) {
                subtotal = subtotal - (subtotal * MEMBERDISCOUNT);
            }
            if (subtotal > 100) {
                subtotal = subtotal - BIGSPENDERDISCOUNT;
            }
            return subtotal;
        }


    double calculateTotal(boolean isMember, boolean hasCoupon) {
       //delete this after generating value
            double subtotal = calculateSubtotal();
            subtotal = applyDiscounts(subtotal, isMember);
            double total = subtotal + (subtotal * TAXRATE);
            if (hasCoupon) {
                total = total - (total * COUPONDISCOUNT);
            }
            return total;
        }
       
}
