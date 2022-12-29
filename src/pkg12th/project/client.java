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
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class client {
    //socket of the client
     Socket socket=new Socket(null);
     //input and output for the client to pass data
     DataInputStream input=new DataInputStream(null);
     DataOutputStream output=new DataOutputStream(null);
//main method initialize the port number and send it to the startclient() method
    public static void main(String[] args) {
       
        client c1=new client();
        c1.startclient(4333);
    }
    /*
    this method takes the port number and initialize the socket by this port
    and sets the input and output streams, then it keeps running in an infinite loop
    until the user types "end" word to close the program
    */
    public void startclient(int port) {
        try {
            
            socket=new Socket("localhost",port);
            System.out.println("Connected to server");
            
            input=new DataInputStream(socket.getInputStream());
            output =new DataOutputStream(socket.getOutputStream());
            
            
            
            while(true){
                Scanner scan=new Scanner(System.in);
                String line=scan.next();
                output.writeUTF(scan.next());
                if(line.equalsIgnoreCase("end")){
                    break;
                }
            }
            input.close();
            output.flush();
            output.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
