package comb.designpattern;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.getCar();
        System.out.println(car1.hashCode());
        Car car2 = Car.getCar();
        System.out.println(car2.hashCode());
        System.out.println("-----------------------------");

        System.out.println(Bus.getBus().hashCode());
        System.out.println(Bus.getBus().hashCode());
    }
}
