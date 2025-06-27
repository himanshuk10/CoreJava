package comb.DSA;

public class Stack {
    
    private int top = 0;
    private int[] stack = new int[5];
    
    public void push(int data){
        stack[top] = data;
        top++;
    }
    public int pop(){
        int ele;
        top--;
        ele = stack[top];
        stack[top] = 0;
        return ele;
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
        Stack stack = new Stack();
        stack.push(25);
        stack.push(23);
        stack.push(12);
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println("Size of stack is : "+stack.size());
    }
}
