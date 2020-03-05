public class Flower extends Product {

    private String color;

    public Flower(double price, String color) {
        super(price, Type.Flower);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\tFlor{Preu: " + super.toString() +
                "€, Color: " + color + "}";
    }
}
