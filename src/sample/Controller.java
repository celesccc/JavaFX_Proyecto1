package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private TextField editText;
    @FXML
    private Button boton;

    public int aleatorio = 0;
    public int input = 0;

    @FXML
    public void setLabelText() {
       aleatorio = (int) (Math.random()*11);
       label.setText(String.valueOf(aleatorio));
    }

    @FXML
    public void onInputEditText() {
        if (label.getText().equals(editText.getText())) {
            boton.setVisible(true);
            boton.setDisable(false);
            setLabelText();
        }else
            boton.setDisable(true);
    }
   /* public void onInputEditText() {
        input++;
        if (input % 2 != 0) {
            if (label.getText().equals(editText.getText())) {
                boton.setVisible(true);
                setLabelText();
            }
        } else {
            if (label.getText().equals(editText.getText()))
                boton.setDisable(false);
            else
                boton.setDisable(true);
        }
    }*/

    @FXML
    public void onClickBoton() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
