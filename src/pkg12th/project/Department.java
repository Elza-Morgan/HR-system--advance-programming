/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;

import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author youssef and elza
 */
public class Department extends employee{
    private int dept_id;
    private String dept_name;
    public static ArrayList<Department> de=new ArrayList<Department>(6); 
    

    public Department() {
    }
    
    Department(String department_name,int department_id){
      super(department_name,department_id);
    }
    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
        
   
    //employee is another class
  
    /*this method is used to add the department by receiving object which includes
    the id and name of the department and put them into the list of departments
    max(6)
    */
    int p=0;
    public void addDepartment(Department objectDepartment){ 
        
        if(p<6){
            de.add(p,objectDepartment);
            p++;
        }
        else{
            JOptionPane.showMessageDialog(null, "max");
        }
    }
    
    /*
    this method takes the id of a specific department and starts searching for it
    in the list of departments and when it finds it, it will display
    its name and id
    */
    public void display_department (int id){
        boolean flag=false;
        for(int  i=0;i<de.size();i++){
          if(de.get(i).getDept_id()==id ){
              JOptionPane.showMessageDialog(null,"Name: "+de.get(i).getDept_name()
              +"\n"+"ID: "+de.get(i).getDept_id());
              flag=true;
              break;
          }
      }
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Not found2");
        }
    }
    /*
    this method takes the id of a specific departmet and starts seaching for it
    and if it finds it, it will return a flag of true, in which we used in 
    User_infoController class to prevent registering an employee in a non-existing department
    */
    public static boolean checkdepartment(int id){
        boolean flag=false;
        for(int i=0;i<de.size();i++){
            if(id==de.get(i).getDept_id()){
                flag=true;
                break;
            }
        }
        return flag;
    }
    /*
    this method takes department id and employee id and starts searching for this employee
    in the list of employees and when it finds him, it will change his department id
    to the new one
    */
    public void changeDepartmentOfEmployee(int DepartmentID, int EmployeeID){
        
         
        boolean flag=false;
        /*first for loop check the exsitence of the employee by the id*/
        for(int z=0; z<employees1.size(); z++){
         if( EmployeeID==employees1.get(z).getId()){
              employees1.get(z).setDepartment_id(DepartmentID);
            }
        }
         if(flag==false){
             JOptionPane.showMessageDialog(null, "This Employee doesn't exsit");
            }
    }
}

