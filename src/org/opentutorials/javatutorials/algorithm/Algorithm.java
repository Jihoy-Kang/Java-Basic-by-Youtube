package org.opentutorials.javatutorials.algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int num = 5;
        if(num == 0) System.out.println(false) ;
        for(int i = 1; i < num;i++){
            if(num%i == 0) System.out.println(false);
            else System.out.println(true);
        }
    }
}
