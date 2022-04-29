package org.opentutorials.javatutorials.array;

public class ForEachDemo {
    public static void main(String[] args){
        String[] members = {"짱구","유리","철수","훈이"};
        for (String e : members){ //배열에 있는 요소들을 하나씩 순차적으로 e라는 변수에 담는다.
            System.out.println(e + "가 상담을 받았습니다.");
        }
    }
}
