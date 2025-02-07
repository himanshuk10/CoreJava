package designpattern;

public class Car {

    private static Car car;
    private Car(){

    }

    //lazy way
    public static Car getCar(){
        if(car==null){
           car= new Car();
        }
        return car;
    }
}

/*
* make constructor private - so object creation restricted from outside class
* object create with help of method
* created field to store object is private
* */
