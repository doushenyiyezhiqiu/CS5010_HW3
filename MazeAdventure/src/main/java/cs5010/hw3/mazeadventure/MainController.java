package cs5010.hw3.mazeadventure;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Map;

public class MainController {
    @FXML
    private Label infoLabel;

    @FXML
    private Button goButton;

    @FXML
    private TextField goToXText;

    @FXML
    private TextField goToYText;

    @FXML
    private void initialize() {
        infoLabel.setText("Player Name: " + Player.getName() + "\n" +
                          "Items: " + Player.printItems());

    }

    @FXML
    private void handleGoButtonClick() {
        String tempX = goToXText.getText();
        int tempY = Integer.parseInt(goToYText.getText());
        for (Map.Entry<String, Pair<String, Integer>> entry : MapOfTheEagle.getItemToPosition().entrySet()) {
            if (entry.getValue().getKey().equals(tempX) && entry.getValue().getValue() == tempY) {
                Player.getItems().add(entry.getKey());
                MapOfTheEagle.removeItemByPosition(new Pair<>(tempX, tempY));
                break;
            }
        }
        infoLabel.setText("Player Name: " + Player.getName() + "\n" +
                "Items: " + Player.printItems());
    }


}