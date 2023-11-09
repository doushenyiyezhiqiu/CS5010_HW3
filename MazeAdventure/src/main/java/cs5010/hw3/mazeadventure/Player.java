package cs5010.hw3.mazeadventure;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static String name = "";
    private static List<String> items = new ArrayList<>();

    public Player(String input) {
        name = input;
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

    public static String printItems() {
        String ans = "";
        for(int i = 0; i < items.size(); i++) {
            if(i == 0) {
                ans += items.get(0);
            } else {
                ans += ", " + items.get(i);
            }
        }
        return ans;
    }
}
