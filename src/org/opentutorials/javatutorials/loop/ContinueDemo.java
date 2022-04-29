package org.opentutorials.javatutorials.loop;

public class ContinueDemo {
    public static void main(String[] args){
        for(int i = 0;i < 10; i++){
            if(i==5)
                continue; // continue를 만나는 순간 일단 반복문 종료 후 다음 반복이 다시 실행/즉 5 건너뛰고 출력됨
            System.out.println("Coding Everybody"+i);
        }
    }
}
