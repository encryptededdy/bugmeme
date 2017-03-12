package nz.zhang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    @FXML private CheckBox check1;
    @FXML private CheckBox check2;
    @FXML private CheckBox check3;
    @FXML private CheckBox check4;
    @FXML private CheckBox check5;
    @FXML

    protected void fixpressed(ActionEvent event) {
        System.out.println("fixing bugs");
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check1.setDisable(true);
        check2.setDisable(true);
        check3.setDisable(true);
        check4.setDisable(true);
        check5.setDisable(true);
        for (int i = 0; i < (int)((Math.random()*5)+1); i++) {
            int randBox = (int)((Math.random()*5)+1);
            switch (randBox) {
                case 1:
                    System.out.println("setting check1");
                    check1.setSelected(true);
                    break;
                case 2:
                    System.out.println("setting check2");
                    check2.setSelected(true);
                    break;
                case 3:
                    System.out.println("setting check3");
                    check3.setSelected(true);
                    break;
                case 4:
                    System.out.println("setting check4");
                    check4.setSelected(true);
                    break;
                case 5:
                    System.out.println("setting check5");
                    check5.setSelected(true);
                    break;
            }
        }
        for (int i = 0; i < (int)((Math.random()*5)+1); i++) {
            int randBox = (int)((Math.random()*5)+1);
            switch (randBox) {
                case 1:
                    System.out.println("enabling check1");
                    check1.setDisable(false);
                    break;
                case 2:
                    System.out.println("enabling check2");
                    check2.setDisable(false);
                    break;
                case 3:
                    System.out.println("enabling check3");
                    check3.setDisable(false);
                    break;
                case 4:
                    System.out.println("enabling check4");
                    check4.setDisable(false);
                    break;
                case 5:
                    System.out.println("enabling check5");
                    check5.setDisable(false);
                    break;
            }
        }


    }
}
