package org.opentutorials.javatutorials.numberstring;

public class CharString {
    public static void main(String[] args) {
        System.out.println('생'); // 문자는 작은따옴표''로 감싸준다.
        System.out.println("생활코딩"); // 문자열은 큰따옴표""로 감싸준다. 만약 작은따옴표로 문자열을 감싸면 에러발생
        System.out.println("생"); //문자를 큰따옴표로 감싸주게되면 문자열로 인식한다.
        //자바는 문자와 문자열을 구분하여 처리함(문자는 한 글자, 문자열은 2개이상의 문자)
        System.out.println("생활"+"코딩"); // 문자열 2개를 +연산자로 합쳐서 나온다.
        System.out.println("1"+"1"); // 큰따옴표로 감싸진 1은 문자열로 인식
        System.out.println("egoing said \"Welcome programming world\""); // 이스케이프기호 역슬래시(\)를 이용하면 따옴표안에 따옴표를 넣을 수 있다.
        System.out.println("egoing said \n \"Welcome programming world\""); // 이스케이프기호 \n 은 줄바꿈으로 인식
    }
}
