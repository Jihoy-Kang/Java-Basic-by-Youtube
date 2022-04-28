package org.opentutorials.javatutorials.constant;

public class ConstantDemo {
    public static void main(String[] args){
        double a = 2.2;
        float b = 2.2F; // F를 이용해 상수2.2를 float 타입으로 명시적으로 지정
        int c = 1234123338;
        long d = 12341233338L; //L을 이용해 d를 long타입으로 명시적으로 지정

        //비트가 적게 사용되는 타입에서 비트를 많이 사용하는 타입으로 현태 변환이 가능함
        //ex) double x = 2.2F float타입의 상수 2.2가 double형태로 암시적으로 자동 변환
    }
}
