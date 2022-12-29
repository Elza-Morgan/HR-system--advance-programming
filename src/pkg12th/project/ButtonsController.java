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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author youssef and elza
 */
public class ButtonsController extends employee implements Initializable {

    /**
     * Initializes the controller class.
     * @param event
     * @throws java.io.IOException
     */
    @FXML
    private TextField id_text;
    int id1;
    //the above variables are for the handleVacationButton method
    @FXML
    private TextField id2_text;
    @FXML
    private TextField number2_text;
    int number2;
    int id2;
    //the above variables are for the handleUseVacationButton method
    
    /*
    this method handles the ENTER DATA button which switch the scene to the USER_Info
    Class which by then allow the operator to enter the data of an employee
    */
    @FXML
    public void handleEnterData(ActionEvent event) throws IOException{
                 
                 Parent DATA = FXMLLoader.load(getClass().getResource("User_Info.fxml"));
                 Scene enterData = new Scene(DATA);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterData);
                 enter.show();
                 
    }
    /*
    this method handles the DISPLAY EMPLOYEES button which switch the scene to the Display_user
    Class which by then allow the operator to display any employee's information by 
    just giving the id stored in the system
    */
    @FXML
    public void handleDisplayEmployees(ActionEvent event) throws IOException{
                Parent enterInfo = FXMLLoader.load(getClass().getResource("Display_user.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();
                 
    }
    /*
    this method handles the CALCULATE BONUS button which switch the scene to 
    the bonus_calculator Class 
    */
    
    @FXML
    public void handleCalculatingBonus(ActionEvent event) throws IOException{
                
                 Parent enterInfo = FXMLLoader.load(getClass().getResource("bonus_calculator.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();                              
    }
    /*
    this method handles the SHOW VACATION DAYS LEFT button which takes only the id of the
    employee and pass it to the vacationdays() method in employee class
    */
    @FXML
    public void handleVacationButton(ActionEvent event) throws IOException{
            
            try{
                id1=Integer.parseInt(id_text.getText());
                vacationDays(id1);
            }catch(Exception e){
                id_text.setText("error");
            }
    }
    /*
    this method handles the SHOW VACATION DAYS LEFT button which takes the id of the
    employee and the number of days which is required for a vacation and pass them to the 
    decrementvacation() method in employee class 
    and this method starts decrementing the number of days from the days left
    */
    @FXML
    public void handleUseVacationButton(ActionEvent event) throws IOException{
                 try{
                     id2=Integer.parseInt(id2_text.getText());
                     number2=Integer.parseInt(number2_text.getText());
                     decrementVacation(id2,number2);
                 }catch(Exception e){
                     id2_text.setText("error");
                 }
    }
    /*
    this method handles the LOGOUT button which simply switch the scene 
    to FXMLDocument class (Login Page)
    */
    @FXML
    public void handleLogoutButton(ActionEvent event) throws IOException{
                Parent enterInfo = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();
    }
    /*
    this method handles the ADD DEPARTMENT button which switch the scene to the add_department
    Class
    */
    @FXML
    public void handleAddDepartmentButton(ActionEvent event) throws IOException{
        
                Parent enterInfo = FXMLLoader.load(getClass().getResource("add_department.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();
    }
    /*
    this method handles the DISPLAY DEPARTMENT button which switch the scene to the display_department
    Class
    */
    @FXML
    public void handleDisplayDepartmentButton(ActionEvent event) throws IOException{
        
                Parent enterInfo = FXMLLoader.load(getClass().getResource("display_department.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 Stage enter=(Stage)((Node)event.getSource()).getScene().getWindow();
                 enter.setScene(enterParent);
                 enter.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
