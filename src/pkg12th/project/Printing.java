/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author youssef and elza
 */
public class Printing implements Runnable{
    /*Constructor of the class it self*/
     Printing()
     {}
 /*This method is used where it will start processing the task that i asked by
    calling from the main thread.start(); and this method is found in interface called
    Runnnable*/
    @Override
    public void run(){
        System.out.print("\nThis data is uploading to be printed");
        for(int i=1; i<=5; i++)
        {
        try {    /*Starts to count like download*/
                 System.out.println("\n"+i);
                 /*This is one of the type of blocking and this method is used to make the tasks 
                 to rest for 1000 ms.So after evry 100ms and counting will apear*/
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Printing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.print("\n.............Its Printing now.............");
        /*this for loop is to show the count down while printing */
    for(int j=5 ; j>=1 ; j--){
    try {
         System.out.print("\n"+j);
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
                Logger.getLogger(Printing.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
        System.out.print("\n.............This data is printed.............");
    
    }
    
}
