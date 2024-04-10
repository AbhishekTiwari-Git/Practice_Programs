package org.example;

public class StackImplementation {

    int size;
    int[] arr;
    int top;

    StackImplementation(int size) {
        this.size = size;
        this.arr = new int[size];
        top = -1;
    }

    /**
     * 1.Empty
     * 2. Full
     * 3.Peek
     * 4.push
     * 5.pop
     */

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size - 1 == top;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty!!");
            return -1;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element is :-" + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is Empty!!");
            return -1;
        }
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed element is:-" + element);
        } else {
            System.out.println("Stack is Full!!");
        }
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        System.out.println("Peek element is:- " + stack.peek());

        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}
