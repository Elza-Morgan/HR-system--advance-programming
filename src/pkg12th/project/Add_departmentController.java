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
public class Add_departmentController extends Department implements Initializable {

    Department dept=new Department();
    String department_name1;
    int department_id1;
    
    @FXML
    private TextField dept_name;
    @FXML
    private TextField dept_id;
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
    this method handles ADD button which takes the department name and the 
    department id and put both of them into a locally defined object from class
    Department and sent the object to addDepartment() method in class Department
    */
    @FXML
    public void handleAddButton(ActionEvent event) throws IOException{
       department_name1=dept_name.getText();
       dept.setDept_name(department_name1);
       department_id1=Integer.parseInt(dept_id.getText());
       dept.setDept_id(department_id1);
       
       addDepartment(dept);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
