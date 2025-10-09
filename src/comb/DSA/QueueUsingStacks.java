package comb.DSA;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation: O(1)
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue operation: O(n)
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation: returns front element
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public int size(){
        return Math.max(stack2.size(), stack1.size());


    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size());
    }
}
