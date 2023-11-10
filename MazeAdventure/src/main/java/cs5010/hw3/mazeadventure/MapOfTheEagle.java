package cs5010.hw3.mazeadventure;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is where we store the map of Dungeon one -- "The Eagle", we will use the string BST as our inventory of items.
 * We also use HashMap to store the position of items as our a real map.
 */
public class MapOfTheEagle {
    private static StringBinarySearchTree itemsInventory = new StringBinarySearchTree();
    private static Map<String, Pair<String, Integer>> itemToPosition = new HashMap<>();

    public static StringBinarySearchTree getItemsInventory() {
        return itemsInventory;
    }

    public static void setItemsInventory(StringBinarySearchTree itemsInventory) {
        MapOfTheEagle.itemsInventory = itemsInventory;
    }

    public static Map<String, Pair<String, Integer>> getItemToPosition() {
        return itemToPosition;
    }

    public static void setItemToPosition(Map<String, Pair<String, Integer>> itemToPosition) {
        MapOfTheEagle.itemToPosition = itemToPosition;
    }

    public static void removeItemByPosition(Pair<String, Integer> pos) {
        for (Map.Entry<String, Pair<String, Integer>> entry : itemToPosition.entrySet()) {
            if (entry.getValue().getValue().equals(pos.getValue()) && entry.getValue().getKey().equals(pos.getKey())) {
                String key = entry.getKey();
                itemToPosition.remove(key);
                itemsInventory.delete(key);
                break;
            }
        }
    }

    public static void addItem(String item, Pair<String, Integer> pos) {
        // To check if the position is filled
        boolean flag = true;
        for (Map.Entry<String, Pair<String, Integer>> entry : itemToPosition.entrySet()) {
            if (entry.getValue().getValue().equals(pos.getValue()) && entry.getValue().getKey().equals(pos.getKey())) {
                flag = false;
                break;
            }
        }
        if (!itemsInventory.exists(item) && flag) {
            itemsInventory.insert(item);
            itemToPosition.put(item, pos);
        }
    }
}
