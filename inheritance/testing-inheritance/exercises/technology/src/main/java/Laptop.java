public class Laptop extends Computer{
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void connectToWifi() {
        System.out.println("Laptop is connecting to WiFi...");
    }
}
