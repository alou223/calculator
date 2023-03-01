package calculatorFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalcController {

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonZero;


    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonRavno;
    @FXML
    private Button buttonClear;
    @FXML
    private Label LABEL;

    private int count = 0;
    private double count1;
    private double count2;
    private boolean countMinus = false;
    private boolean countPlus = false;
    private boolean countMultiply = false;
    private boolean countDivide = false;

    @FXML
    public void initialize() {
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(1); LABEL.setText("1");
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(2); LABEL.setText("2");
        });
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(3); LABEL.setText("3");
        });
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(4); LABEL.setText("4");
        });
        button5.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(5); LABEL.setText("5");
        });
        button6.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(6); LABEL.setText("6");
        });
        button7.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(7); LABEL.setText("7");
        });
        button8.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(8); LABEL.setText("8");
        });
        button9.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(9); LABEL.setText("9");
        });
        buttonZero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            calc(0); LABEL.setText("0");
        });


        buttonPlus.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            countPlus = true; LABEL.setText("+");
        });
        buttonMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            countMinus = true; LABEL.setText("-");
        });
        buttonMultiply.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            countMultiply = true; LABEL.setText("*");
        });
        buttonDivide.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            countDivide = true; LABEL.setText("/");
        });
        buttonClear.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            count1 = 0;
            count2 = 0;
            countMultiply = false;
            countPlus = false;
            countMinus = false;
            countDivide = false;
            LABEL.setText("");
        });
        buttonRavno.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            double i = 0;
            if (countPlus) {
                i = count1 + count2;
                countPlus = false;
            } else if (countMinus ) {
                i = count1 - count2;
                countMinus = false;
            } else if (countMultiply) {
                i = count1 * count2;
                countMultiply = false;
            } else if (countDivide) {
                i = count1 / count2;
                countDivide = false;
            }


            LABEL.setText(String.valueOf(i));
        });

    }


    private void calc(double i) {
        if (count == 0) {
            count1 = i;
            count++;
        } else {
            count2 = i;
            count = 0;
        }
    }


}
