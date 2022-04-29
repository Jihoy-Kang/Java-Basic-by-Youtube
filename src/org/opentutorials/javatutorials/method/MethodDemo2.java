package org.opentutorials.javatutorials.method;
//main은 자바와 개발자 사이의 약속
//실행하고자 명령이 있다면 public static void main(String[] args)가 이끄는 중괄호{}안에 위치시켜야한다.
//자바가 실행될때 main메소드가 호출되면서 원하는 명령이 실행된다.

public class MethodDemo2 {
    public static void main(String[] args){
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
