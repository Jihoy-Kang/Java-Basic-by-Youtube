package org.opentutorials.javatutorials.numberstring;

    public class Stringtest {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("문자열 : " + str);
        System.out.println(str.compareTo("bcef"));
        System.out.println(str.compareTo("abcd") + "\n");
        System.out.println(str.compareTo("Abcd"));
        System.out.println(str.compareToIgnoreCase("Abcd"));
        System.out.println("compareTo() 메서드 호출 후 문자열 : " + str);

        String str2 = new String("Java");
        System.out.println("문자열 : " + str2);
        System.out.println(str2.concat("수업"));
        System.out.println("concat() 메서드 호출 후 문자열 : " + str2);

        String str3 = new String("Oracle Java");
        System.out.println("문자열 : " + str3);
        System.out.println(str3.indexOf('o'));
        System.out.println(str3.indexOf('a'));
        System.out.println(str3.indexOf("Java"));
        System.out.println("indexOf() 메서드 호출 후 원본 문자열 : " + str3);

        String str4 = new String(" Java     ");
        System.out.println("문자열 : " + str4);
        System.out.println(str4 + '|');
        System.out.println(str4.trim() + '|');
        System.out.println("trim() 메서드 호출 후 문자열 : " + str4);

        String str5 = new String("Java");
        System.out.println("문자열 : " + str5);
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println("두 메서드 호출 후 문자열 : " + str5);
    }
}
