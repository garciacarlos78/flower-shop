public class Tree extends Product {

    private double height;

    public Tree(double price, double height) {
        super(price, Type.Tree);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\tArbre{Preu: " + super.toString() +
                "€, Alçada: " + String.format("%.3f", height) +
                '}';
    }
}
