package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {

    static Queue<Integer> queue;

     StackImplementationUsingQueue(){
        this.queue = new LinkedList<>();
    }

    public void push(int x){
        queue.add(x);
        for(int i=1;i<queue.size();i++){
            queue.add(queue.remove());
        }
    }

    public Integer pop(){
        return queue.remove();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public Integer peek(){
        return queue.peek();
    }

    public static void main(String[] args) {
        StackImplementationUsingQueue si = new StackImplementationUsingQueue();
        si.push(10);
        si.push(20);
        si.push(30);
        si.push(40);
        si.push(50);


        System.out.println(queue.isEmpty());
    }
}
