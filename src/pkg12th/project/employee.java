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

public class employee extends person {
    double salary;
    private int vacationDays=50;
    String type;
    String title;
    private int Manager_id;
    private int hours_worked;
    double gross_pay=200;
    int pw;
    String user_name;
    private String complain;
    int j=0;
    private String grade;
    private int department_id;
    String department_name;
    public static ArrayList<employee> employees1=new ArrayList<employee>(20);
    employee(){
       
    }
    employee(int emp_id,int Manger_id){
        this.Manager_id=Manger_id;
        this.id=emp_id;
    }
    employee(String type,String title){
        this.type=type;
        this.title=title;
    }
    public employee(double salary){
        this.salary=salary;
    
    }
    employee(double salary, String type){
        this.salary=salary;
        this.type=type;
    }
    employee(String type, String title, double salary){
        this.type=type;
        this.title=title;
        this.salary=salary;
    }
    employee(String department_name,int department_id){
        this.department_id=department_id;
        this.department_name=department_name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public int getVacationDays() {
        return vacationDays;
    }
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
     public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int year_worked) {
        this.hours_worked = year_worked;
    }
    public int getManager_id() {
        return Manager_id;
    }

    public void setManager_id(int Manager_id) {
        this.Manager_id = Manager_id;
    }
    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    
    /*
    this method recieves the data of an employee in an object form and store in the arraylist
    */
    
    public void addEmployee(employee emp){
        
        if(j<20){
        employees1.add(j,emp);
        j++;
        }else
        JOptionPane.showMessageDialog(null,"Max number of employees reached");
    }
    /*this method recieves the id of the employee and starts to search for it in
    the array, and when it finds it, it displays the days of vacation left
    */
    public void vacationDays(int id){
        boolean flag=false;
        for(int  i=0;i<employees1.size();i++){
          if(employees1.get(i).id==id ){
             JOptionPane.showMessageDialog(null,employees1.get(i).getVacationDays()+" left");
              flag=true;
              break;
          }
          
      }
        //if it didnt find the id 
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Not found");
        }
    }
    /*this method recieves the id of the employee and starts to search for it in
    the array, and when it finds it, it will decement the number of days by one
    */
    public void decrementVacation(int id,int number){
        boolean flag=false;
        for(int  i=0;i<employees1.size();i++){
          if(employees1.get(i).id==id ){
              /*if the number required for the vacation not less than zero then it 
              is possible to get the vacation required
              */
              if(employees1.get(i).getVacationDays()!=0){
             employees1.get(i).setVacationDays(employees1.get(i).getVacationDays()-number);
              flag=true;
              break;
              }
          }
      }
        //if it didnt find the id 
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Not found");
        }
    }
    /*
    this method receives the id number and starts to search for it in the arraylist
    and when it finds it, it removes the whole cell from the list
    */
    public void deleteEmployee(int id){
      boolean flag=false;
      
      for(int i=0;i<employees1.size();i++){
          if(employees1.get(i).id==id ){
              employees1.remove(i);
              flag=true;
              break;
          }
      }
      if(flag==false){
          JOptionPane.showMessageDialog(null, "ID not found");
      }
    }
    /*this method recieves the id of the employee and starts to search for it in
    the array, and when it finds it, it will display the whole information about the employee
    */
    public void display (int id){
        boolean flag=false;
        for(int  i=0;i<employees1.size();i++){
          if(employees1.get(i).id==id ){
              JOptionPane.showMessageDialog(null,"Name: "+ employees1.get(i).name+"\n"+"Type: "
                      +employees1.get(i).type+"\n"+"Title: "+employees1.get(i).title+"\n"+
                      "Id: "+employees1.get(i).id+"\n"+"Age: "+employees1.get(i).getAge()+"\n"+
                      "Salary: "+employees1.get(i).salary+"\n"+"Dept id: "+employees1.get(i).getDepartment_id());
              flag=true;
              break;
          }
      }
        //if it didnt find the id 
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Not found");
        }
    }
    
    /*this method recieves object contains the id and grade and then it starts to search 
    for the id of the employee and when it finds it, it starts to check which grade has the user input
    and then it starts to modify the salary of the specific element
    */
    A_Grade grade_a=new A_Grade();
    B_Grade grade_b=new B_Grade();
    C_Grade grade_c=new C_Grade();
    public void bonusCalculator(employee emp){
        boolean flag=false;
        double salary1=0;
        for(int i=0;i<employees1.size();i++){
                if(emp.id==employees1.get(i).getId()){
                    salary1=employees1.get(i).salary;
                    if(emp.grade.equalsIgnoreCase("A")){
                        salary1=grade_a.calculating_Bonus(salary1);
                        employees1.get(i).setSalary(salary1);
                        
                    }else if(emp.grade.equalsIgnoreCase("B")){
                    salary1=grade_b.calculating_Bonus(salary1);
                    employees1.get(i).setSalary(salary1);
                    
                    }else if(emp.grade.equalsIgnoreCase("C")){
                    salary1=grade_c.calculating_Bonus(salary1);
                    employees1.get(i).setSalary(salary1);
                    
                    }else{
                       
                        JOptionPane.showMessageDialog(null, "Wrong input ");
                    }
                flag=true;
                break;
            }
        }
        if(flag==false){
            JOptionPane.showMessageDialog(null, "ID NOT FOUND");
        }
       
    }

}