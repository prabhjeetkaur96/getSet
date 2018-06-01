/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author macstudent
 */
public class personTest {
    public static void main(String args[]){
        person sumanth = new person();
        sumanth.name = "sumanth";
        sumanth.address = "toronto";
        sumanth.age = 20;
        System.out.println("Name :" + sumanth.name + "\n address :" + sumanth.address + "\n age :" + sumanth.age);
  
        
//    person foram = new person();
//    foram.setName();
//    String nm = foram.getName();
//     foram.setAddress();
//    String add= foram.getAddress();
//     foram.setAge();
//    int age = foram.getAge();
//   System.out.println(" Name :" + nm + "\n address :" + add + "\n age :" + age);
//  
//    person anu = new person();
//    anu.setData();
//    System.out.println(anu.toSting());
    
person aman = new person();
System.out.println(aman.toString ());

person rimpal = new person("rimpal", "brampton",20);
System.out.println(rimpal.toString ());

person rimpal2 = new person(rimpal);
System.out.println(rimpal2.toString ());
     }  
         }
