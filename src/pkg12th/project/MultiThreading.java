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
public class MultiThreading {
    
     public static void main(String[] args){
            /*There is an object created which is left empty*/
           Printing print=new Printing();
           /*This is an object which is called thread in class built in called 
           Thread and the parameter will take the object name of the class which
           is implememts Runnable and interface and Thread extend interface*/
           Thread thread=new Thread (print);
           /*This is used to call the method in the class Printing an method 
           called run so the threading starts to run*/
       thread.start();
     }
}
