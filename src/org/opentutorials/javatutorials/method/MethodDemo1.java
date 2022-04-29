package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    public static void numbering(){ // 메소드 정의(define)
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        numbering(); //위 numbering()이라는 메소드 호출(call)
        numbering();
        numbering(); // 호출한 횟수만큼 실행된다.
    }
}
