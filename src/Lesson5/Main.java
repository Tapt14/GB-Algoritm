package Lesson5;

import Lesson5.Backpack.Backpack;
import Lesson5.Backpack.FillingBackpack;
import Lesson5.Backpack.Item;

public class Main {

    public static void main(String[] args) {

        //Тесть возведения в степень
        //System.out.println(RecExponentiation.recExponentiation(5,3));

        Backpack backpack = new Backpack(12);
        Item[] list = new Item[5];
        FillingBackpack fillingBackpack = new FillingBackpack(list);

        list[0] = new Item(300, 5);
        list[1] = new Item(200, 2);
        list[2] = new Item(450, 4);
        list[3] = new Item(600, 9);
        list[4] = new Item(750, 4);

        System.out.println(fillingBackpack.findBestFillBackpack(list.length -1, backpack.getLiftingCapacity()));


    }
}
