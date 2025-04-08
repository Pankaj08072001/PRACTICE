package BasicOfjava;
    abstract class Vehicle {
        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public abstract void start();
    }

    class Car extends Vehicle {

        public Car(String make, String model, int year) {
            super(make, model, year);
        }

        @Override
        public void start() {
            System.out.println("Starting car engine...");
        }
    }

    class ElectricCar extends Car {

        public ElectricCar(String make, String model, int year) {
            super(make, model, year);
        }

        @Override
        public void start() {
            System.out.println("Starting electric car silently...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car myCar = new Car(null, null, 0);
            ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 2023);

            System.out.println("Car Make: " + myCar.getMake());
            myCar.setMake("Honda");
            System.out.println("Updated Car Make: " + myCar.getMake());

            myCar.start();
            myElectricCar.start();    
        
        }
    }