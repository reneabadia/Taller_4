package Exercise_1;

import static java.lang.Math.cos;

public class PlanetarySystem {

    /**
     * Native variables of the class
     */
    public AstronomicalObject object1;
    public AstronomicalObject object2;

    /**
     * This method calculates  Newton's gravitational attraction force between two astronomical objects.
     * Also, it calculates distance between objects using triangular geometry with reference on Sun.
     * The angle between objects distances, with vertex on Sun, is measured in sexagesimal degrees.
     * @param object1 first object of class 'AstronomicalObject'.
     * @param object2 second object of class 'AstronomicalObject'.
     * @return return attraction force measured in Newtons.
     */
    public double gravityForce(AstronomicalObject object1, AstronomicalObject object2, double sunAngle){

        this.object1 = object1;
        this.object2 = object2;
        double ma = object1.getMass();
        double mb = object2.getMass();
        double ra = object1.getSunDistance();
        double rb = object2.getSunDistance();

        double R2 = ra*ra + rb*rb - 2*ra*rb*cos(sunAngle*180/Math.PI);
        double G = 6.67430e11;

        return G*ma*mb / R2;
    }


}