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
import static pkg12th.project.Department.checkdepartment;
/**
 * FXML Controller class
 *
 * @author youssef and elza
 */
public class User_InfoController extends employee  implements Initializable {

    /**
     * Initializes the controller class.
     */ 
    employee emp=new employee();
    String type1;
    String title1;
    String name1;
    int department1_id;
    int id1;
    int age;
    double salary1;
    
    @FXML
    private TextField type_text;
    @FXML
    private TextField title_text;
    @FXML
    private TextField salary_text;
    @FXML
    private TextField name_text;
    @FXML
    private TextField id_text;
    @FXML
    private TextField age_text;
    @FXML
    private TextField department_id;
    
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
    this method handles the CONFIRM button which takes the 6 locally defined variables
    about the employee(type,title, name, id, age, salary, department it) and put them in also 
    a locally defined object from 
    employee class, but before passing the object to be added, we checked the department id 
    entered for the employee if it is stored in the list of departments or not
    and if it found it then passes this object  to addEmployee() 
    method in class employee to add it to the list safely
    */
    @FXML
    public void handleConfirm(ActionEvent event){
                boolean check=false;
            
                type1=type_text.getText();
                emp.type=type1;
                
                title1=title_text.getText();
                emp.title=title1;
                
                name1=name_text.getText();
                emp.name=name1;
                
                id1=Integer.parseInt(id_text.getText());
                emp.setId(id1);
                
                age=Integer.parseInt(age_text.getText());
                emp.setAge(age);
                
                salary1=Double.parseDouble(salary_text.getText());
                emp.salary=salary1;
                
                department1_id=Integer.parseInt(department_id.getText());
                check=checkdepartment(department1_id);
                if(check){
                    emp.setDepartment_id(department1_id);
                    addEmployee(emp);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Department id does not exit");
                }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void handleAddDepartmentButton(ActionEvent event) throws IOException{
    }
    
}
