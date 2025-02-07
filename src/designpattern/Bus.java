package designpattern;

public class Bus {
    private static Bus bus = new Bus();

    public static Bus getBus(){
        return bus;
    }
}
