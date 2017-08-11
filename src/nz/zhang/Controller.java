package nz.zhang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Controller {
    @FXML private CheckBox check1;
    @FXML private CheckBox check2;
    @FXML private CheckBox check3;
    @FXML private CheckBox check4;
    @FXML private CheckBox check5;
    @FXML

    public static CheckBox randomBox(ArrayList<CheckBox> list) {
        Random rand = new Random();
        CheckBox box = list.get(rand.nextInt(list.size()));
        return box;
    }

    @FXML
    protected void fixpressed(ActionEvent event) {
        System.out.println("fixing bugs");
        ArrayList<CheckBox> checkBoxes = new ArrayList<>(Arrays.asList(check1, check2, check3, check4, check5));
        for (CheckBox checkbox : checkBoxes) {
            checkbox.setSelected(false);
            checkbox.setDisable(true);
        }
        Random rand = new Random();
        int randomSelections = rand.nextInt(5);
        int randomEnables = rand.nextInt(5);
        for (int i = 0; i < randomSelections; i++) {
            randomBox(checkBoxes).setSelected(true);
        }
        for (int i = 0; i < randomEnables; i++) {
            randomBox(checkBoxes).setDisable(false);
        }


    }
}
