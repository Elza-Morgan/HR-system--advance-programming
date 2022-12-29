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
public class Manager extends employee implements calculate_salary{
    
    
    
    Manager(){
        
    }
    Manager(int emp_id,int manager_id){
        super(emp_id,manager_id);
    }
    public Manager(int id,String name){
        super(id,name);   
    }
    Manager manager[]=new Manager[5];
    
    /*
    this method is overriden from interface calculate_salary which receives the gross_pay
     and devides it by 8 which is the number of working hours and then return it
    */
    @Override
    public double calculateFullTime_Hourly(double gross_pay) {
        return gross_pay/8;
    }
    
    /*
    this method is overriden from interface calculate_salary which receives the gross_pay
    and the worked hours and devides gross pay by worked hours for part timers and return the result
    */
    @Override
    public double calculatePartTime_Hourly(double gross_pay, int worked_hours) {
        return gross_pay/worked_hours;
    }
}
