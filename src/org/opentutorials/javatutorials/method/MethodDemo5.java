package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
    public static void numbering(int init, int limit){ // 매개변수를 두개 받는다.
        int i = init;
        while (i < limit){ //입력값에 따라서 명령 실행
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        numbering(3, 5); //인자를 두개 받는다.
    }
}
