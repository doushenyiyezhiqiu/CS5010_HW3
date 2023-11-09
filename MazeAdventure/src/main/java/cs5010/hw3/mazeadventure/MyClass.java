package cs5010.hw3.mazeadventure;

public class MyClass<E extends Comparable<E>> {
    private E data;

    public MyClass(E data) {
        this.data = data;
    }

    public int compareTo(E other) {
        return this.data.compareTo(other);
    }

}
