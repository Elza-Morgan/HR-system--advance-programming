/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author youssef and elza
 */
public class Display_departmentController extends Department implements Initializable {

    @FXML
    private TextField dep_id;
    int de_id;
    /*
    this method handles the BACK button which switch the scene to go back to the buttons
    class. Thus, it can excute another operation by clicking another button
    */
    @FXML
    public void handleBackButton(ActionEvent event) throws IOException{
                 Parent enterInfo = FXMLLoader.load(getClass().getResource("buttons.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();
    }
    /*
    this method handles the DISPLAY button which will receive the id of the department
    and then pass it to the display_department() method in the Department class to display the
    name and id of that department
    */
    @FXML
    public void handleDisplayButton(ActionEvent event) throws IOException{
                 de_id=Integer.parseInt(dep_id.getText());
                 display_department(de_id);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
