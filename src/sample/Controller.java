package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML public TextField ageInput;
    @FXML public TextField MaximumHR;
    @FXML public TextField TargetHR;
    @FXML public Button calculateButton;

    @FXML
    public void CalculateHR(ActionEvent event){
        int age = Integer.parseInt(ageInput.getText());
        int maxHR = 220 - age;
        int targHR50 = (maxHR * 50)/100;
        int targHR85 =(maxHR * 85)/100;
        MaximumHR.setText(maxHR + " bpm");
        TargetHR.setText(targHR50 + "-"+ targHR85 + " bpm");
    }


}
