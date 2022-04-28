package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {
    public static void  main(String[] args){
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); //true 문자열을 비교할때는 .equals 매소드를 사용해야한다.
    }
}
