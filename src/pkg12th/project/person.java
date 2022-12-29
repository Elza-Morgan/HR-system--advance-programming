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
public class person {
    private int age;
    String name;
    
    int id;
    private int mobile_number;
    char gender;
    private String address;
    person(){
        
    }
    public person(String name){
        this.name=name;
    }
    person(int age, String name){
        this.age=age;
        this.name=name;
    }
    person(int age, String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
