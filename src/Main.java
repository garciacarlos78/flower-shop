import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create flower shop
        FlowerShop flowerShop = createFlowerShop("The best flower shop in the known world");

        // Testing
        addTree(5, 4, flowerShop);
        addTree(25.99, 8.9374, flowerShop);
        addTree(10, 1, flowerShop);

        addDecor(4.50, Decor.Material.wood, flowerShop);
        addDecor(6.50, Decor.Material.plastic, flowerShop);
        addDecor(4.50, Decor.Material.wood, flowerShop);

        addFlower(2.59, "groc", flowerShop);
        addFlower(4.50, "vermell", flowerShop);
        addFlower(1, "blau", flowerShop);

        System.out.println(stock(flowerShop));
    }

    private static FlowerShop createFlowerShop(String name) {
        return new FlowerShop(name);
    }

    private static void addTree (double price, double height, FlowerShop flowerShop) {
        flowerShop.addTree(new Tree(price, height));
    }

    private static void addFlower(double price, String color, FlowerShop flowerShop) {
        flowerShop.addFlower(new Flower(price, color));
    }

    private static void addDecor(double price, Decor.Material material, FlowerShop flowerShop) {
        flowerShop.addDecor(new Decor(price, material));
    }

    private static String stock(FlowerShop flowerShop) {

        // Get all the products of the flower shop
        List<Product> stock = flowerShop.getStock();

        // Initialize a StringBuilder to return the result
        StringBuilder sb = new StringBuilder("\nStock de la floristeria \"" + flowerShop.getName() + "\":\n");

        // Create 3 lists to return the products ordered by type
        List<Tree> trees = new ArrayList<>();
        List<Flower> flowers = new ArrayList<>();
        List<Decor> decors = new ArrayList<>();

        for (Product product :
                stock) {
            switch (product.getType()){
                case Tree:
                    trees.add((Tree) product);
                    break;
                case Flower:
                    flowers.add((Flower) product);
                    break;
                case Decor:
                    decors.add((Decor) product);
                    break;
            }
        }

        // Fill in the list of trees if there is any
        if (trees.size()>0) {
            sb.append("\nArbres:\n");
            for (Tree tree :
                    trees) {
                sb.append(tree.toString()).append("\n");
            }
        }

        // Fill in the list of flowers if there is any
        if (flowers.size()>0) {
            sb.append("\nFlors:\n");
            for (Flower flower : flowers) {
                sb.append(flower.toString()).append("\n");
            }
        }

        // Fill in the list of decors if there is any
        if (decors.size()>0) {
            sb.append("\nDecoracions:\n");
            for (Decor decor: decors) {
                sb.append(decor.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}