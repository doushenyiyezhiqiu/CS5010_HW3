module cs5010.hw3.mazeadventure {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens cs5010.hw3.mazeadventure to javafx.fxml;
    exports cs5010.hw3.mazeadventure;
}