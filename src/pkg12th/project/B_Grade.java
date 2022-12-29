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
public class B_Grade implements Grade{
    
    /*
    this method is overridden from interface Grade which receives the employee salary
    and starts to multiply the B Value by the salary and then returns it
    */
    double B_bonus;
    @Override
    public double calculating_Bonus(double employee_salary)
   {
       B_bonus=B*employee_salary;
       return B_bonus;
   }
}
