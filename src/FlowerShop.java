import java.util.ArrayList;
import java.util.List;

public class FlowerShop {

    private String name;
    private List<Product> stock;

    public FlowerShop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTree(Tree tree) {
        stock.add(tree);
    }

    public void addFlower(Flower flower){
        stock.add(flower);
    }

    public void addDecor(Decor decor) {
        stock.add(decor);
    }

    public List<Product> getStock() {
        return stock;
    }
}
