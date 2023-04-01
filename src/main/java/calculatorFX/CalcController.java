package calculatorFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

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
    private Button buttonDegree;
    @FXML
    private Button buttonDegree2;
    @FXML
    private Button buttonDegree3;

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
    @FXML
    private Label LABEL2;

    private double count = 0;
    private String str = "";
    private double count1;
    private boolean countMinus = false;
    private boolean countPlus = false;
    private boolean countMultiply = false;
    private boolean countDivide = false;
    private boolean countDegree = false;
    private boolean countDegree2 = false;
    private boolean countDegree3 = false;

    @FXML
    public void initialize() {
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "1";
            calc(1); LABEL.setText(str);
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "2";
            calc(2); LABEL.setText(str);
        });
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "3";
            calc(3); LABEL.setText(str);
        });
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "4";
            calc(4); LABEL.setText(str);
        });
        button5.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "5";
            calc(5); LABEL.setText(str);
        });
        button6.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "6";
            calc(6); LABEL.setText(str);
        });
        button7.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "7";
            calc(7); LABEL.setText(str);
        });
        button8.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "8";
            calc(8); LABEL.setText(str);
        });
        button9.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "9";
            calc(9); LABEL.setText(str);
        });
        buttonZero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "0";
            calc(0); LABEL.setText(str);
        });


        buttonPlus.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "+";
            countPlus = true; LABEL.setText(str);
        });
        buttonMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "-";
            countMinus = true; LABEL.setText(str);
        });
        buttonMultiply.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "*";
            countMultiply = true; LABEL.setText(str);
        });
        buttonDivide.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            str = str + "/";
            countDivide = true; LABEL.setText(str);
        });
        buttonClear.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            count1 = 0;
            countMultiply = false;
            countPlus = false;
            countMinus = false;
            countDivide = false;
            countDegree = false;
            countDegree2 = false;
            countDegree3 = false;
            LABEL.setText("");
            LABEL2.setText("");
            str = "";
        });
        buttonRavno.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            if (countPlus) {
                countPlus = false;
            } else if (countMinus ) {
                countMinus = false;
            } else if (countMultiply) {
                countMultiply = false;
            } else if (countDivide) {
                countDivide = false;
            }
            LABEL2.setText(String.valueOf(str));

            try {
                LABEL.setText(String.valueOf(calc2(str)));
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
            try {
                str = String.valueOf(calc2(str));
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
        });
        buttonDegree.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse ->{
            double i;
            if (countDegree){}
                i = count1 * count1;
                countDegree = false;
                LABEL.setText(String.valueOf(i));



        });
        buttonDegree2.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse ->{
            double i;
            if(countDegree2){}
            i = count1 * count1 * count1;
            countDegree2 = false;
            LABEL.setText(String.valueOf(i));
        });
        buttonDegree3.addEventHandler(MouseEvent.MOUSE_CLICKED, mouse -> {
            double i;
            if (countDegree3){}
                i = Math.sqrt(count1);
                countDegree3 = false;
                LABEL.setText(String.valueOf(i));



        });

    }


    private void calc(double i) {
        if (count == 0) {
            count1 = i;
            count++;
        } else {
            count = 0;
        }
    }
private double calc2(String str) throws ScriptException {
       double i1;
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    i1 = (double) engine.eval(str);
    return i1;
}

}
