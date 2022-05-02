package Exercise_1;

public class Main_1 {
    public static void main(String[] args){


        /*
          Instancing some astronomical objects of different classes.
         */
        Planet Earth = new Planet(1,"Earth planet",1000, 10000);
        Comet Halley = new Comet(2,"Halley comet",2000, 20000);

        /*
         * Define a new planetary system to use calculation method.
         */
        PlanetarySystem system = new PlanetarySystem();

        /*
         * Calculate gravity force between instanced astronomical objects using method of planetary system.
         */
        double F = system.gravityForce(Earth,Halley,30);
        System.out.print("The attraction gravitational force between ");
        System.out.print(Earth.getName() + " and " + Halley.getName() + " is: ");
        System.out.println(F + " Newtons.");

    }

}
