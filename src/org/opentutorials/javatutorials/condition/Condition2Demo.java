package org.opentutorials.javatutorials.condition;

public class Condition2Demo {
    public static void main(String[] args){
        if(false){  //조건이 맞지않을 경우 건너뛴다.
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);
    }
}
