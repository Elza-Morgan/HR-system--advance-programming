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
//import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author youssef and elza
 */

public class Display_userController extends employee  implements Initializable {
                                            
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField id_text;
    int id1;
    
    
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
    this method handles the DISPLAY button which takes the id of the
    employee and pass it to display() method in employee class to display all the information about
    this id from the list
    */
    @FXML
    public void handleDisplayUser(ActionEvent event){
        
        try{
            id1=Integer.parseInt(id_text.getText());
            display(id1);
        
        }catch(Exception e){
            id_text.setText("ID required");
        }
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
