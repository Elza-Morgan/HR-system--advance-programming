/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12th.project;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author youssef and elza
 */
public class server {
    //host server socket
    Socket socket;
    //server socket
    ServerSocket server;
   //input and output for the server
    DataInputStream input;
    DataOutputStream output;
    
    //main method initialize the port number of the server
    public static void main(String[] args) {
         server serr=new server(4333);
    }
    /*
    this method takes the port number and initialize the server socket by this port
    and call the accept method from ServerSocket class which Listens for a connection 
    to be made to this socket and accepts it. The method blocks until a connection is made. 
    the input and output streams, then it keeps running in an infinite loop
    until the line String reads the "end" word, then closes inputstream and socket
    and serversocket
    */
    public server(int port) {
        try {
            System.out.println("server is running");
            server=new ServerSocket(port);
            socket=server.accept();
            System.out.println("Connected to server");
            
            
            output=new DataOutputStream(socket.getOutputStream());
            input=new DataInputStream(socket.getInputStream());
            
            
            while(true){
                String line=input.readUTF();
                System.out.println(line);
                if(line.equalsIgnoreCase("end"))break;
            }
            
            input.close();
            socket.close();
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
