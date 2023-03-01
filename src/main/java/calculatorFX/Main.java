package calculatorFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass()
                .getClassLoader().getResource("fxml/editor.fxml")));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Калькулятор");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();

//        // установка надписи
//        Text text = new Text("Hello METANIT.COM!");
//        text.setLayoutY(80);    // установка положения надписи по оси Y
//        text.setLayoutX(80);   // установка положения надписи по оси X
//
//        Group group = new Group(text);
//        Scene scene = new Scene(group);
//        stage.setScene(scene);
//        stage.setTitle("JavaFX Application");
//        stage.setWidth(300);
//        stage.setHeight(250);
//        stage.show();
    }
}
