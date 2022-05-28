package org.opentutorials.javatutorials.algorithm;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;

public class Codestates {
    public static void main(String[] args){
        int bufferSize = 1;
        int capacities = 100;
        int[] documents = new int[]{1, 24, 14, 78, 90};

        int sec = 1;
        int i = 1;

        ArrayList<Integer> pollQue = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(documents[0]);
        pollQue.add(bufferSize+1);
        int queCapa = documents[0];
        while (!queue.isEmpty()){
            sec += 1;
            if(sec == pollQue.get(0)){
                queCapa = queCapa - queue.peek();
                queue.poll();
                pollQue.remove(0);
            }
            if(i < documents.length){
                if(queue.size() < bufferSize && (queCapa+documents[i]) <= capacities){
                    queue.offer(documents[i]);
                    queCapa = queCapa + documents[i];
                    pollQue.add(sec+bufferSize);
                    i += 1;
                }
            }
        }
        System.out.println(sec);
    }
}





