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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author youssef and elza
 */

public class Bonus_calculatorController extends employee implements Initializable {

    /**
     * Initializes the controller class.
     */
    employee emp=new employee();
    String grade;
    int ID;
    
    @FXML
    private TextField grade_text;
    @FXML
    private TextField id_text;
    
    
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
    this method handles the CALCULATE button which takes the id of the
    employee and the grade of the employee he has already got and put both of them
    into a locally created object (emp) and pass the object to the bonucCalculator() method
    in class employee
    */
    @FXML
    public void handleCalculate(ActionEvent event) throws IOException{
        boolean flag=false;
        grade=grade_text.getText();
        ID=Integer.parseInt(id_text.getText());
        emp.id=ID;
        emp.setGrade(grade);
        bonusCalculator(emp);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
