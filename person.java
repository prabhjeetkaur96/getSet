/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class person {
    String name;
    String address;
    int age;
   Scanner in =new Scanner(System.in); 
   //default constructor
   person(){
   name = "Unknown";
   address = "Unknown";
   age = 1;
   }
   person (String name ,String address, int age) 
   {
   this.name = name ;
   this.address = address;
   this.age = age;
   
   }
   //copy construcor
   person (person anotherPerson)
   {
       this.name = anotherPerson.name ;
   this.address = anotherPerson.address;
   this.age = anotherPerson.age;
   
   }
   //constructor overloading 
    void setName(){
 
 System.out.println("Enter Name :");
  name = in.nextLine();
  }
    String getName(){
        return name;
    }
    void setAddress(){
     System.out.println("Enter Address :");   
    address = in.nextLine();
    }
     String getAddress(){
     return address;
     
     }
       void setAge(){
     System.out.println("Enter Age:");   
    age =  Integer.parseInt(in.nextLine());
    }
       int getAge(){
           return age;
       }
       void setData(){
           setName();
           setAddress();
           setAge();
          }
       
     
    @Override
        public String toString(){
           String data ="Name : " + name + "\n Address : " +address +"\n age : " + age;
           return data;
       }
}
