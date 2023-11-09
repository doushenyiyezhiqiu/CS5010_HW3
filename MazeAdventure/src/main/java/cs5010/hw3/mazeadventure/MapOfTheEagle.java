package cs5010.hw3.mazeadventure;

import java.util.HashMap;
import java.util.Map;

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
        if (!itemsInventory.exists(item)) {
            itemsInventory.insert(item);
            itemToPosition.put(item, pos);
        }
    }
}
