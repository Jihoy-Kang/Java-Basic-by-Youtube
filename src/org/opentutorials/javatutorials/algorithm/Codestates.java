package org.opentutorials.javatutorials.algorithm;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;

public class Codestates {
    public static void main(String[] args){
        int bufferSize = 1;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6,1,5,2,9,8,7,2,1,};

        int sec = 0;
        int queCapa = 0;
        int i = 0;

        ArrayList<Integer> pollQue = new ArrayList<Integer>();
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(bufferSize);

        queue.offer(documents[0]);
        pollQue.add(bufferSize+1);
        while (!queue.isEmpty()){
            sec += 1;
            queCapa = 0;
            if(sec == pollQue.get(0)){
                queue.poll();
                pollQue.remove(0);
            }
            for(int que : queue){
                queCapa += que;
            }

            if((queCapa+documents[i]) <= capacities && i < documents.length-1){
                queue.offer(documents[i]);
                pollQue.add(sec+bufferSize);
                    i += 1;
            }
        }
        System.out.println(sec);
    }
}


