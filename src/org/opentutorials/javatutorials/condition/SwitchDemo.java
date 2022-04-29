package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
    public static void main(String[] args){
        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(3)");
        switch(3){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(1)-break"); //break를 걸게되면 뒤에 불필요한 자료 출력을 막을 수 있다.
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
        }

        System.out.println("switch(4)-default"); //입력값이 조건에 없을때 default가 실행된다.
        switch(4){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
    }
}
