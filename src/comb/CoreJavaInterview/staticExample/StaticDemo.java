package comb.CoreJavaInterview.staticExample;

class Mobile{
    String brand;
    int price;
     static String type;

    public void show(){
        System.out.println(brand+" : "+price+" : "+type);
    }
    public static void show1(Phone obj1){
        System.out.println(obj1.brand+" : "+obj1.price+" : "+type);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.type = "smartphone";

        Phone obj2 = new Phone();
        obj2.brand = "Realme";
        obj2.price = 500;
        obj2.type = "smartphone";

//        Mobile.type="xyz";
//        Mobile.show1(obj1);

        obj1.show();
        obj2.show();


    }
}

/*
 * static variable is shared with all object
 * static variable is class level variable
 * Non-static variable cannot be used in static block, but we can use by passing object as reference
 */
