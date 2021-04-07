package ObligatoriskeOpgaverInheritance;

public abstract class Vehicles {
        //Defining attributes
        private String brand;
        private int nrOfWheels;
        private boolean hasEngine;

        //Defining parameters
        public Vehicles(String brand, int nrOfWheels, boolean hasEngine){
            this.brand = brand;
            this.nrOfWheels = nrOfWheels;
            this.hasEngine = hasEngine;
        }
        //Method
        public abstract String vehicleSound();
}

