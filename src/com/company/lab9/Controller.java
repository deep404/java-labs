package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label resultBox;

    @FXML
    private TextField dividentBox;

    @FXML
    private TextField divisorBox;

    private String divident = "";
    private String divisor = "";
    private double result = 0.0;
    private String error = "";

    public void setResultBox(String stringResult) {
        this.resultBox.setText(stringResult);
        this.divident = "";
        this.divisor = "";
    }

    public void checkDivisor(double number) throws UnluckyException, divisionBy0{
        if(number == 13){
            throw new UnluckyException();
        }
        else if(number == 0){
            throw new divisionBy0();
        }
    }

    public void readDivident() {
        this.divident = dividentBox.getText();
    }

    public void readDivisor() {
        this.divisor = divisorBox.getText();
    }

    public void printResult(MouseEvent mouseEvent) {
        try {
            readDivident();
            readDivisor();
            checkDivisor(Double.valueOf(this.divisor));
            this.result = Double.valueOf(this.divident) / Double.valueOf(this.divisor);
            setResultBox(String.valueOf(this.result));
        } catch (NumberFormatException e) {
            System.out.println(e);
            this.error = String.valueOf(e);
            if (this.error.contains("multiple points")){
                setResultBox("Error: invalid input (multiple points)");
            }
            else if (this.error.contains("For input string")){
                setResultBox("Error: invalid input (string found)");
            }
            else if (this.error.contains("empty String")){
                setResultBox("Error: empty input");
            }
        } catch (UnluckyException i){
            setResultBox("Error: division by 13");
        } catch (divisionBy0 p){
            setResultBox("Error: division by 0");
        }

    }
}
