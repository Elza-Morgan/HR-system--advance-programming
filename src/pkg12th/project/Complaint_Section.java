/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;



/**
 *
 * @author youssef and elza
 */
public class Complaint_Section extends Manager{
    
    private int employee_id;
    private int manager_id; 
    private String complaint_text;
    //employee emp=new employee();/*object is created sense */
    Complaint_Section(int employee_id,int manager_id){
        this.employee_id=employee_id;
        this.manager_id=manager_id;
    }
   
    /*
    this method is reponsible for directing the complaint for the right manager 
    of the specific employee
    */
  public void complaining(int employee_id, int manager_id){
      boolean flag=false;
      /*this first loop is for finding the employee in the company*/
      for(int i=0 ; i<employees1.size() ; i++){
          if(employee_id==employees1.get(i).getId()){ /*this sceond is made for searching that this manager exsite or not to
              complain to*/
              for(int j=0 ; j<manager.length ; j++){
                  if(this.manager_id==manager[j].getManager_id()){   
                      flag=true;
                      
                      
                    }
                }
            }
        }
  
      if(flag==false){
          //System.out.println("This Employee doesn't exsist");
      
       }
    }

    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getComplaint_text() {
        return complaint_text;
    }

    public void setComplaint_text(String complaint_text) {
        this.complaint_text = complaint_text;
    }
}

