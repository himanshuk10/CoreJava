package comb.DSA;

public class Queue {

    int[] queue = new int[4];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        queue[rear] = data;
        rear = rear+1;
        size = size+1;
    }
    public int deQueue(){
        int data = queue[front];
        front = front + 1;
        size = size - 1;
        return data;
    }
    public int size(){
        return 0;
    }
    public boolean isEmpty(){
       return true;
    }

    public void show(){
        System.out.print("Elements : ");
        for (int i=0; i<size; i++){
            System.out.print(queue[front+i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(6);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(8);
        q.show();
        System.out.println(q.deQueue());
        q.show();
        System.out.println(q.deQueue());
        q.show();

    }

}
