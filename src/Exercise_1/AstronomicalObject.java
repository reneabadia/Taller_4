package Exercise_1;

public abstract class AstronomicalObject {

    /**
     * Native variables of the abstract class.
     * Variables 'diameter' and 'sunDistance' in kilometers.
     * Variable 'mass' in kilograms.
     */
    public int id;
    public String name;
    public double mass;
    public double density;
    public double diameter;
    public double sunDistance;

    /**
     * Object constructor
     */
    public AstronomicalObject(){
        this.id = 0;
        this.name = "";
        this.mass =0;
        this.density = 0;
        this.sunDistance = 0;
    }

    /**
     * Method to get astronomical object's mass.
     * @return return the mass in kilograms.
     */
    public double getMass(){
        return this.mass;
    }

    /**
     * Method to get distance between object and the Sun,
     * @return return the distance in kilometers.
     */
    public double getSunDistance() {
        return this.sunDistance;
    }

    /**
     * Method to get astronomical object's name.
     * @return return the name as String.
     */
    public String getName(){
        return this.name;
    }


}
