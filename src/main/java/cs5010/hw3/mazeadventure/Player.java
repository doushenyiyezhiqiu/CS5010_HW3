package cs5010.hw3.mazeadventure;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class we design to store the player's information.
 */
public class Player {
    private static String name = "";
    private static List<String> items = new ArrayList<>();

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static List<String> getItems() {
        return items;
    }

    public static void setItems(List<String> items) {
        Player.items = items;
    }

    public static String printItems() {
        String ans = "";
        for (int i = 0; i < items.size(); i++) {
            if (i == 0) {
                ans += items.get(0);
            } else {
                ans += ", " + items.get(i);
            }
        }
        return ans;
    }
}
