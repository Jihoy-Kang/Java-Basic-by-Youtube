package org.opentutorials.javatutorials.algorithm;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        System.out.println(showTime(9, 10, 10));
    }
    public static String showTime(int hour, int min, int sec) {
        // TODO:
        Scanner sc = Scanner(System.in);
        return "현재 시각은 ".concat(Integer.toString(hour)).concat("시 ").concat(Integer.toString(min)).concat("분 ").concat(Integer.toString(sec)).concat("초 입니다.");
    }
}
