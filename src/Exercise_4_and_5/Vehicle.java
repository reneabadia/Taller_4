package Exercise_4_and_5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Vehicle {

    /**
     * Declaration of private and public variables.
     */
    private final int id;
    private final String dateRegister;
    private double velocity;
    public String environment;
    public int crewSize;
    public int numPassengers;
    public double rateAccelerate;
    public Calendar calendar = Calendar.getInstance();


    /**
     * Object constructor for Vehicle class
     * @param id Identification number of the vehicle
     * @param environment Environment of transportation: 'earth', 'sea' or 'sky'
     * @param crewSize Size of crew
     * @param numPassengers Number of passengers
     * @param rateAccelerate rate of acceleration in kilometers by hour
     * @param dateRegister date of registration of vehicle
     */
    public Vehicle(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister){
        this.id = id;
        this.environment = environment;
        this.crewSize = crewSize;
        this.numPassengers = numPassengers;
        this.rateAccelerate = rateAccelerate;
        this.dateRegister = dateRegister;
    }


    /**
     * Method to print summary information of vehicle object.
     * It converts date string to calendar instance.
     * @throws ParseException to letting pass date string as parameter.
     */
    public void getInfo() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(dateRegister);
        calendar.setTime(dateObj);

        System.out.println("\nVEHICLE SUMMARY: ");
        System.out.print("ID: " + id);
        System.out.print(" | Environment: " + environment);
        System.out.printf(" | Registration date: %tb %<te, %<tY", calendar);
        System.out.print(" | Crew size:" + crewSize);
        System.out.print(" | Passengers: " + numPassengers);
        System.out.print(" | Acceleration rate: " + rateAccelerate + " km/h.");
        System.out.println(" | Velocity: " + velocity + " km/h.");
    }


    /**
     * Method to set velocity (km/h).
     * @param velocity vehicle velocity in kilometers by hour.
     */
    public void setVelocity(double velocity){
        this.velocity = velocity;
    }


    /**
     * Method to get velocity (km/h).
     * @return return the velocity as a double number.
     */
    public double getVelocity(){
        return this.velocity;
    }


    /**
     * Method to get rate of acceleration (km/h2).
     * @return the rate acceleration of vehicle as double number.
     */
    public double getRateAccelerate(){
        return this.rateAccelerate;
    }


    /**
     * Method to accelerate the vehicle a certain number of times.
     * @param pulses impulses of acceleration.
     */
    public void accelerate(int pulses){
        double v = pulses * ( this.getVelocity() + this.getRateAccelerate() );
        this.setVelocity(v);
    }

}