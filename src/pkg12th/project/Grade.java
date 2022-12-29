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
/*
this interface will be implemented by three classes (A_grade,B_grade, C_grade)
*/
public interface Grade {
    final int A =200;
    final int B =50;
    final int C =1;
    // this method receives the employee salary and starts calculating its bonus
    // depending in his grade in each class
    public double calculating_Bonus(double employee_salary);
    /*This interface is made for calculating a slary
    for each employee depending onto their grades per year*/
}
