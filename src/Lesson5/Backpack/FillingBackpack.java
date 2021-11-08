package Lesson5.Backpack;

import java.util.ArrayList;
import java.util.List;

public class FillingBackpack {

    private Item[] items;

    public FillingBackpack(Item[] items) {
        this.items = items;

    }

    public Item[] getItemList() {
        return items;
    }

    public int findBestFillBackpack(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weight) {
            return findBestFillBackpack(i - 1, weight);
        } else {
            return Math.max(findBestFillBackpack(i - 1, weight),
                    findBestFillBackpack(i - 1, weight - items[i].getWeight()) + items[i].getWeight());
        }
    }
}
