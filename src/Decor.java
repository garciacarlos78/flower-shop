public class Decor extends Product {

    enum Material {
        wood,
        plastic
    }

    private Material material;

    public Decor(double price, Material material) {
        super(price, Type.Decor);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\tDecoració{Preu: " + super.toString() +
                "€, Material: " + (material==Material.wood?"fusta":"plàstic") +"}";
    }
}
