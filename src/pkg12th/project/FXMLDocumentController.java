/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Youssef and Elza
 */
public class FXMLDocumentController implements Initializable {
    
    String t1;
    String t2;
    
    @FXML
    private TextField login_text;
    @FXML
    private TextField pw_text;
    
    
    /*
    this method handles the LOGIN button which reads from the file if the operator's username and password
    are identical to the data stored in the external file or not, and when it finds it,
    it will allow the operator to access employee's methods
    */
    @FXML
    private void handleUser_Info(ActionEvent event) throws IOException {
        
        int j=0;
        boolean flag=false;
        Scanner input=new Scanner(new File("C:\\Users\\Elza Morgan\\Desktop\\"
      + "12th project Elza Morgan and Youssef El-Tabib\\Youssef and Elza.txt"));
         t1=login_text.getText().toString();
         t2=pw_text.getText().toString();
        input.useDelimiter("[:\n]");
        /*we used the deimiter to separate the username from the password in 
        the same line by*/ 
        while(input.hasNext()){
            String i= input.next();
            String i2=input.next();
            if(i.equals(t1)&&i2.equals(t2)){
                 Stage enter=(Stage)((Node)event.getSource()).getScene()
                         .getWindow();
                 Parent enterInfo = FXMLLoader.load(getClass().getResource(
                         "buttons.fxml"));
                 Scene enterParent = new Scene(enterInfo);
                 enter.setScene(enterParent);
                 enter.show();
                 flag=true;
            }
        }
        if(flag==false){
            JOptionPane.showMessageDialog(null, "not found");
        }
    }
    /*
    this method handles the resgister button which takes the inputs 
    (username and password)
    and starts writing in the file the username and password
    */
    @FXML
    private void handleRegisterButton(ActionEvent event) throws IOException  {
        String imp;
      imp=login_text.getText().toString()+":"+pw_text.getText().toString()+"\n";
        File file=new File("C:\\Users\\Elza Morgan\\Desktop\\1"
       + "2th project Elza Morgan and Youssef El-Tabib\\Youssef and Elza.txt");
        /*the reason true is sent with the file path, 
        so it doesnt rewrite on the previous data*/
        FileWriter w=new FileWriter(file,true);
        w.write(imp.toString());
        w.close();
        JOptionPane.showMessageDialog(null, "Registered successfully");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}



