/*
 */
package javafx_intelui;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Daniildeveloper
 */
public class FXMLController implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton button;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void handelButtonAction(ActionEvent event) {
        if (event.getSource() == button) {
            pane.toFront();
        }
    }

}
