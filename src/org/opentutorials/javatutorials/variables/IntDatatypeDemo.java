package org.opentutorials.javatutorials.variables;

public class IntDatatypeDemo {
    public static void main(String[] args){
        //정수형
        byte a; // -128 ~ 127까지 담을 수 있다.(1byte 메모리이용)
        a = 127;
        short b; // -32,768 ~ 32,767까지 담을 수 있다. (2byte 메모리이용)
        b = 32767;
        int c; // -2147483648 ~ 2147483647까지 담을 수 있다. 주로사용함 (4byte 메모리이용)
        c = 2147483647;
        long d; //-9,223,372,036,854,775,808 ~ 9223372036854775807까지 담을 수 있다. 주로사용함 (8byte 메모리이용)
        d = 9223807;

        //실수형
        float e; //float (4byte)
        double f; //double(8byte)

        //문자형
        char g; // 모든 유니코드 문자사용가능 2byte

    }
}
