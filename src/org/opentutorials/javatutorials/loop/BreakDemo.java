package org.opentutorials.javatutorials.loop;

public class BreakDemo {
    public static void main(String[] args){
        for(int i = 0;i < 10; i++){
            if(i==5)// if문 안에 내용이 한 줄이라면 중괄호 생략가능 { }
                break; // break만나는 순간 반복문 종료
            System.out.println("Coding Everybody"+i);
        }
    }
}
