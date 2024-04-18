
    public class Smartphone extends Computer {
        private String operatingSystem;

        public Smartphone(String brand, String model, double price, String operatingSystem) {
            super(brand, model, price);
            this.operatingSystem = operatingSystem;
        }

        public String getoperatingSystem() {
            return operatingSystem;
        }
        public void makeCall(String number) {
            System.out.println("Calling " + number + " from your smartphone...");
        }
    }
