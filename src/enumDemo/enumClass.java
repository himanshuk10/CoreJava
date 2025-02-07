package enumDemo;

enum Laptop{
    Macbook(2000), XSP(1500), Surface, Thinkpad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop " + this.name());
    }
//default constructor because of surface which value we did not set
    private Laptop() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class enumClass {
    public static void main(String[] args) {
//        Laptop lap = Laptop.Macbook;
//        System.out.println(lap+" : "+lap.getPrice());

        for (Laptop lap: Laptop.values()) {
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
