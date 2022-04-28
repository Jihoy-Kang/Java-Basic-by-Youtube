package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void  main(String[] args){
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b); //정수 틀안에서 실수값을 갖기 때문에 결과값의 소수점 이하의 값들은 누락된다.
        System.out.println(c/d); //실수 틀안에서 결과값이 실수이기때문에 값의 누락없이 그대로 출력
        System.out.println(a/d); //정수와 실수를 이용하기 때문에 프로그램이 정수를 자동으로 실수로 형변화 시키기 때문에 누락없이 그대로 출력

    }
}
