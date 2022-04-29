package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
    public static String numbering(int init, int limit){ //String은 numbering이라는 메소드는 반드시 문자열을 리턴한다라는 뜻을 같는다.
        int i = init;
        String output = "";
        while(i<limit){
            output += i;
            i++;
        }
        return output;
    }

    public static void  main(){ // void는 매소드의 리턴값이 존재하지 않느다라는 의미
        String result = numbering(1, 5);
        System.out.println(result);
    }
}
