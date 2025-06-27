package comb.DSA;

public class DStack {

    int capacity=2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size()==capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *= 2;
    }

    public int pop(){
        int ele=0;
        top--;
        ele = stack[top];
        stack[top] = 0;
        shrink();
        return ele;
    }

    private void shrink() {
        int length = size();
        if(length <= (capacity/2)/2)
            capacity = capacity/2;

        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
    }

    public int peek(){
        return stack[top-1];
    }


    public void show(){
        for (int ele : stack) {
            System.out.print(ele +" ");
        }
        System.out.println();
    }

   public boolean isEmpty(){
        return top<=0;
   }
   public int size(){
        return top;
   }

    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.push(25);
        stack.show();
        stack.push(23);
        stack.show();
        stack.push(12);
        stack.show();
        stack.push(23);
        stack.show();
        stack.push(43);
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();


    }
}
