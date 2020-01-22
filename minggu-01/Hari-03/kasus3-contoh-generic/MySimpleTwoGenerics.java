package com.java2novice.generics;
 
public class MySimpleTwoGenerics {
 
    public static void main(String a[]){
         
        SimpleGen<String, Integer> sample = new SimpleGen<String, Integer>("JAVA2NOVICE", 100);
        sample.printTypes();
    }
}
 
/**
 * Simple generics class with two type parameters U, V. 
 */
class SimpleGen<U, V>{
     
    //type U object reference
    private U objUreff;
    //type V object reference
    private V objVreff;
     
    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
     
    public void printTypes(){
        System.out.println("U Type: "+this.objUreff.getClass().getName());
        System.out.println("V Type: "+this.objVreff.getClass().getName());
    }
}