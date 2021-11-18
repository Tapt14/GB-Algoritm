package Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        for (int i = 0; i < 7 ; i++) {
            map.put(random.nextInt(100), "a");
        }

        map.put(47, "a");

        System.out.println(map);

        map.delete(47);

        System.out.println(map);
    }
}

