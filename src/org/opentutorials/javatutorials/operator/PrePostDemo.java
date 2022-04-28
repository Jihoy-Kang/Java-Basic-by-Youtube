package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void  main(String[] args){
        int i = 3;
        i++;
        System.out.println(i); // 4
        ++i;
        System.out.println(i); //5
        System.out.println(++i); //6 - i에서 1을 더한값을 그대로 출력
        System.out.println(i++); //6 - i에 값을 출력한 후 1을 더함
        System.out.println(i); // 7 - 위에서 1을 더하고 왔기때문에 7이 출력됨
    }
}
