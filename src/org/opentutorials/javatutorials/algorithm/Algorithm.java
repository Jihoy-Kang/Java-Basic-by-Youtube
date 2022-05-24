package org.opentutorials.javatutorials.algorithm;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i =1;

        List<Integer> prime = new ArrayList<>();

        while(i <= num){
            prime.clear();
            int even =sc.nextInt();
            //소수 구하기
            for(int h=2; h <= even; h+=2) {
                for (int j = 1; j <= even; j++) {
                    if (h % j != 0 && !prime.contains(j)) {
                        prime.add(j);
                    }
                }
            }
            System.out.println(prime);

            //장벽구하기
            loop:
            for(int a = prime.size()/2; a >= 0; a--){
                for(int b = a; b < prime.size();b++){
                    if(prime.get(a)+ prime.get(b) > even){
                        continue;
                    }else if(prime.get(a)+ prime.get(b) == even){
                        System.out.println(prime.get(a) +" "+ prime.get(b));
                        break loop;
                    }
                }
            }
                i++;
        }
    }
}
