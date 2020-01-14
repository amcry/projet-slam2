package fr.dampierre;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @FXML
    private ListView<?> LvInscription;

    ObservableList inscriptions= FXCollections.observableArrayList();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Demo JavaFX");
        stage.show();
    }
    @FXML
    void click(ActionEvent event) {
        inscriptions.add("coucou");
        LvInscription.setItems(inscriptions);
    }

    public static void main(String[] args) {
        launch();
    }

}

