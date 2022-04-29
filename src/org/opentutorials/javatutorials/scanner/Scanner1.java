package org.opentutorials.javatutorials.scanner;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        //1.스캐너기능 생성
        Scanner scan = new Scanner(System.in);
        
        //2. 스캐너로 입력바든 데이터를 변수에 할당
        System.out.println("정수입력 :");
        int a = scan.nextInt(); // 정수
        System.out.println("실수입력 :");
        float b = scan.nextFloat(); // 실수
        System.out.println("공백x 문자열 입력 :");
        String c = scan.next(); // 공백없는문자열
        System.out.println("공백o 문자열 입력 :");
        String d = scan.nextLine(); // 공백 포함하는 문자열
        scan.close();

    }
}
