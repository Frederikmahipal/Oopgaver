package ObligatoriskeOpgaverInheritance;

//Extending class to use the attributes from 'Vehicles'
public class Bicycle extends Vehicles {
    public Bicycle(String brand, int nrOfWheels, boolean hasEngine) {

        super(brand, nrOfWheels, hasEngine);
    }
    //Implementing method and overriding the functionality of the method
    @Override
    public String vehicleSound() {
        return "Bicycle sound";
    }
}
