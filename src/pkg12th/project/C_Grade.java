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
public class C_Grade implements Grade{
    /*
    this method is overridden from interface Grade which receives the employee salary
    and starts to multiply the C Value by the salary and then returns it
    */
    double C_bonus;
    
    @Override
    public double calculating_Bonus(double employee_salary)
   {
       double C_bonus=C*employee_salary;
       return C_bonus;
   }
}
