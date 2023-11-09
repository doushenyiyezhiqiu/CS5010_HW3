package cs5010.hw3.mazeadventure;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label infoLabel;

    @FXML
    private void initialize() {
        System.out.println(Player.getName());
        System.out.println(Player.printItems());

        infoLabel.setText("Player Name: " + Player.getName() + "\n" +
                          "Items: " + Player.printItems());

    }


}