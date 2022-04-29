package org.opentutorials.javatutorials.array;

public class LengthDemo {
    public  static  void  main(String[] args){
        String[] classGroup = new String[4]; // 새로운것을 만들기 위해 new를 썼고, 지금 이 줄에서는 배열을 정의하기 위함
        // 문자열 4개를 담을 수 있는 배열. 값은 아직 부여되지 않아 null로 표기 됨
        classGroup[0] = "짱구"; //배열변수 0번째 데이터를 짱구로 변환
        System.out.println(classGroup.length); // .length는 배열에 몇개의 변수를 담을 수 있는가를 표현해줌.
        classGroup[1] = "유리";
        System.out.println(classGroup.length);
        classGroup[2] = "철수";
        System.out.println(classGroup.length);
        classGroup[3] = "훈이";
        System.out.println(classGroup.length);
    }
}
