package comb.designpattern.prototype;

public class Vehicle implements Cloneable{
    private String type;
    public Vehicle(String type){
        this.type = type;
    }

    @Override
    protected Object clone() {
        try {
            return (Vehicle)super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone failed", e);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike");
        Vehicle clonedBike = (Vehicle) bike.clone();
        System.out.println(bike.getType());
        System.out.println(clonedBike.getType());

        clonedBike.setType("Scooter");
        System.out.println(bike.getType());
        System.out.println(clonedBike.getType());

    }
}
