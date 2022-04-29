package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
    public static void numbering(int limit){ // 숫자형 입력값을 받는다. int limit을 인자로 들어가는 값을 수용하기위한 매개변수(parameter)라고한다.
        int i = 0;
        while (i < limit){ //입력값에 따라서 명령 실행
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        numbering(5); // 입력값 5에 맞는 결과값 출력 5와 같이 입력하는 값을 인자(argument)라고 한다
    }
}
