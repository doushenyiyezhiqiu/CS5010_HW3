package cs5010.hw3.mazeadventure;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is the main application class.
 * Before running the whole application, we will initially add 6 items into the map.
 * "Key": C5.
 * "Compass": D4.
 * "Bow": B2.
 * "Old Man": C1.
 * "Boss": B5.
 * "Triforce Piece": B6.
 * "Map": C3.
 */
public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);

        Image image = new Image(getClass().getResourceAsStream("Images/zelda-icon.jpg"));
        stage.getIcons().add(image);

        stage.show();
    }

    public static void main(String[] args) {
        loadMap();
        launch();
    }

    private static void loadMap() {
        MapOfTheEagle.getItemsInventory().insert("Key");
        MapOfTheEagle.getItemToPosition().put("Key", new Pair<>("C", 5));

        MapOfTheEagle.getItemsInventory().insert("Bow");
        MapOfTheEagle.getItemToPosition().put("Bow", new Pair<>("B", 2));

        MapOfTheEagle.getItemsInventory().insert("Boomerang");
        MapOfTheEagle.getItemToPosition().put("Boomerang", new Pair<>("C", 4));

        MapOfTheEagle.getItemsInventory().insert("Triforce Piece");
        MapOfTheEagle.getItemToPosition().put("Triforce Piece", new Pair<>("B", 6));

        MapOfTheEagle.getItemsInventory().insert("Compass");
        MapOfTheEagle.getItemToPosition().put("Compass", new Pair<>("D", 4));

        MapOfTheEagle.getItemsInventory().insert("Boss");
        MapOfTheEagle.getItemToPosition().put("Boss", new Pair<>("B", 5));

        MapOfTheEagle.getItemsInventory().insert("Old Man");
        MapOfTheEagle.getItemToPosition().put("Old Man", new Pair<>("C", 1));

    }
}