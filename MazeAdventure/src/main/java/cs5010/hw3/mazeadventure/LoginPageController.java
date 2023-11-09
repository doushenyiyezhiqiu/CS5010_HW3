package cs5010.hw3.mazeadventure;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {
    @FXML
    private TextField playerNameText;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLoginButtonClick() throws Exception{
        Player.setName(playerNameText.getText());
        OpenNewWindow.openNewWindowAndClosePreviousWindow(loginButton, "main-page.fxml");
    }

}
