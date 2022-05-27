package org.opentutorials.javatutorials.algorithm;
import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        long num = 1;
        if(num == 0 || num==1) {
            System.out.println(true);
        }
        long i = 2;
        while(i < num){
            i = (long)i*2;
        }
        if(num == i){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
