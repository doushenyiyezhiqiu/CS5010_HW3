package cs5010.hw3.mazeadventure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Envelop one "always used" function - close one window and open a new one into a global class so that each controller
 * class can use the method.
 */
public class OpenNewWindow {

    public static void openNewWindowAndClosePreviousWindow(Button button, String fileName) throws Exception {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(OpenNewWindow.class.getResource(fileName));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Image image = new Image(OpenNewWindow.class.getResourceAsStream("Images/zelda-icon.jpg"));
        stage.getIcons().add(image);

        stage.setResizable(false);

        stage.show();
    }
}
