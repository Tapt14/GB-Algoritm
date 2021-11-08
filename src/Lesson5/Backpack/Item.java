package Lesson5.Backpack;

public class Item {
    private final int price;
    private final int weight;

    public Item(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
