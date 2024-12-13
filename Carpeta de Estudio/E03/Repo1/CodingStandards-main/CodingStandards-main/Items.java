

public class Items {
    private String name;
    private double price;
    private int qty;
    private String category;

    Items(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        category = "general";
    }

    double getTotal() {
    return price * qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
