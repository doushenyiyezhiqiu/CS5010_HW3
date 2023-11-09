package cs5010.hw3.mazeadventure;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<String> items;

    public Player(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
