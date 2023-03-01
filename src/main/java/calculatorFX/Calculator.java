package calculatorFX;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class Calculator {

    AnchorPane root = new AnchorPane();

    public Calculator(){
        FXMLLoader loadSetting = new FXMLLoader(Objects.requireNonNull(getClass().getClassLoader().
                getResource("fxml/editor.fxml")));
        try{
            loadSetting.load();

//            this.getScene() = loadSetting.getRoot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        root.getChildren().add(loadSetting);
    }
}
