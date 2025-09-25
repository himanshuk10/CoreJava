package test;

import java.util.Arrays;

public class GenericDemo {
    public static void main(String[] args) {
        String[] name = {"john", "bob", "alice", "nice"};
        printArray(name);
        Integer[] nums = {1,2,3,4,5};
        printArray(nums);
    }
    public static <T> void printArray(T[] array){
        int i = 0;
        System.out.print("[");
        for (T element : array){
            if(i != array.length-1){
                System.out.print(element + ", ");
                i++;
            }else{
                System.out.print(element);
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
