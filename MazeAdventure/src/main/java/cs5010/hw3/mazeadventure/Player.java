package cs5010.hw3.mazeadventure;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static String name;
    private static List<String> items;

    public Player(String input) {
        name = input;
        items = new ArrayList<>();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String input) {
        name = input;
    }

    public static List<String> getItems() {
        return items;
    }

    public static void setItems(List<String> itemList) {
        items = itemList;
    }
}
