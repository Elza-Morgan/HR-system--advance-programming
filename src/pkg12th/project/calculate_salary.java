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
public interface calculate_salary {
    /*
    these methods will be implemented according the type or employee(parttimer or fulltimer)
    */
    public  double calculateFullTime_Hourly(double gross_pay);    
    public  double calculatePartTime_Hourly(double gross_pay, int worked_hours);
     
}
