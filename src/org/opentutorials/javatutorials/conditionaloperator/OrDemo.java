package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {
    public static void main(String[] args){
        if(true || true){ // ||는 or와 같음 둘중하나가 true 일 때 명령어 실행
            System.out.println(1);
        }

        if(true || false){
            System.out.println(2);
        }

        if(false || true){
            System.out.println(3);
        }

        if(false || false){
            System.out.println(4);
        }
    }
}
