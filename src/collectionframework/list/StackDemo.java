package collectionframework.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
//        s.add(100);
//        s.add("rahul");

        s.push("ravi");//4
        s.push("rahul");//3
        s.push(100);//2
        s.push(20);//1
//        System.out.println(s.peek());//peek() -> retrive the top most element but not remove
//        System.out.println(s.pop());//pop() -> retrive and remove the top most element
        System.out.println(s.search(12));
        System.out.println(s.empty());
    }
}
