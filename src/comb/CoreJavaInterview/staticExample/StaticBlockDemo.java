package comb.CoreJavaInterview.staticExample;

class Phone {
    String brand;
    int price;
    static String type;
    static {
        type = "New";
        System.out.println("I am inside static");
    }

    public Phone(){
        brand = "Apple";
        price = 1000;
        System.out.println("Inside constructor.......");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("comb.CoreJavaInterview.staticExample.Phone");
//        Phone obj1 = new Phone();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        obj1.type = "smartphone";

//        Phone obj2 = new Phone();
    }
}

/*
* static block execute at time of class loading
*
* */

