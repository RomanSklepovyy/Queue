package com.ua;

public class QueueTest
{
    public static void main(String[] arg) {

        ObjectQueue queue = new ObjectQueue();

        for(int i=0; i<10; i++) {

            queue.push("Line: " + i);
        }

        for(int i=0; i<queue.size(); i++) {
            String s = (String)queue.get(i);
            System.out.println(s);
        }

        System.out.println("===============");

        while(queue.size() > 0) {

            String s = (String)queue.pull();
            System.out.println(s);
            System.out.println("Queue size: " + queue.size());
        }
    }
}
