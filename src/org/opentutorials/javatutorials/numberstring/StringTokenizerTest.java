package org.opentutorials.javatutorials.numberstring;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "This is a string example using StringTokenizer";
        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println(str);
        System.out.println();

        System.out.println("total tokens:" + tokenizer.countTokens());
        // 아래의 while 코드는 반복문의 한 종류인데 어떻게 작동하는지 추후 반복문 챕터에서 공부할 예정이니 걱정하지 않으셔도 됩니다.
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("total tokens:" + tokenizer.countTokens());
    }
}