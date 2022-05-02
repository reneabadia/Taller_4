package Exercise_4_and_5;

public class Airplane extends Vehicle{

    /**
     * Object constructor
     *
     * @param id             Identification number of the vehicle
     * @param environment    Environment of transportation: 'earth', 'sea' or 'sky'
     * @param crewSize       Size of crew
     * @param numPassengers  Number of passengers
     * @param rateAccelerate rate of acceleration in kilometers by hour
     * @param dateRegister   date of registration of vehicle
     */
    public Airplane(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister) {
        super(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
        this.environment = "air";
        this.crewSize = 2;
    }


    /**
     * Method to valide if initial speed is enough for take-off airplane.
     */
    public void takeOff(){
        double v0 = getVelocity();
        if (v0 < 100) {
            System.out.println("Insufficient initial speed for take-off.");
        }
        else {
            System.out.println("Valid initial speed for take-off.");
        }
    }

}
