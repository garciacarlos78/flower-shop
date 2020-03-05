public abstract class Product {

    enum Type {
        Tree,
        Flower,
        Decor
    }

    private double price;
    private Type type;

    public Product(double price, Type type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%.2f", price);
    }
}
