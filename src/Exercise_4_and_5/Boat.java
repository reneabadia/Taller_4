package Exercise_4_and_5;

public class Boat extends Vehicle {

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
    public Boat(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister) {
        super(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
        this.environment = "water";
    }


    /**
     *
     */
    public void dropAnchor(){
        if (getVelocity()<10){
            System.out.println("You can drop anchor.");
        }
        else
        {
            System.out.println("You should no set anchor.");
        }
    }


}
