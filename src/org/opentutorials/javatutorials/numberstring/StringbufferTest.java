package org.opentutorials.javatutorials.numberstring;

public class StringbufferTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println("문자열 : " + str);
        System.out.println(str.append(" programming"));
        System.out.println("append() 메서드 호출 후 문자열 : " + str);

        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("Java");
        System.out.println(str01.capacity());
        System.out.println(str02.capacity());

        StringBuffer str3 = new StringBuffer("Java Oracle");
        System.out.println("문자열 : " + str3);
        System.out.println(str3.delete(4, 8));
        System.out.println(str3.deleteCharAt(1));
        System.out.println("deleteCharAt() 메소드 호출 후 문자열 : " + str3);

        StringBuffer str4 = new StringBuffer("Java Programming!!");
        System.out.println("문자열 : " + str4);
        System.out.println(str4.insert(4, "Script"));
        System.out.println("insert() 메서드 호출 후 문자열 : " + str4);
    }
}
