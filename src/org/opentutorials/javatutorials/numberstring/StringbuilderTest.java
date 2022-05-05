package org.opentutorials.javatutorials.numberstring;

public class StringbuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
        String str = stringBuilder.toString();
        System.out.println(stringBuilder);
        System.out.println(str);
    }
}
