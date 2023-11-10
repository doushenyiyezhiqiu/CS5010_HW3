package cs5010.hw3.mazeadventure;

/**
 * The class is to represent a position.
 * @param <K> to be axis-X(string from "A" to "F").
 * @param <V> to be axis-Y(integer from 1 to 6).
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

