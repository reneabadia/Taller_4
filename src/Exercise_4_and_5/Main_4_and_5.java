package Exercise_4_and_5;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_4_and_5 {

    public static void main(String[] args) throws ParseException {

        /*
        Define scanner object for input variables values.
         */
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {

            /*
            Input info of vehicle object.
            Ask by ID, crew size, number of passengers, rate of acceleration and date of registration.
             */
            System.out.println("\nGENERAL VEHICLE INFORMATION: ");
            System.out.print("Input ID (0 to exit): ");
            int id = input.nextInt();
            if(id==0){break;}
            System.out.print("Input environment (earth, water, sky): ");
            String environment = input.next();
            System.out.print("Input crew size: ");
            int crewSize = input.nextInt();
            System.out.print("Input number of passengers: ");
            int numPassengers = input.nextInt();
            System.out.print("Input rate of acceleration: ");
            double rateAccelerate = input.nextDouble();
            System.out.print("Input date of registration (dd/MM/yyyy): ");
            String dateRegister = input.next();

            /*
            To instance an object of vehicle class and print its summary information.
             */
            Vehicle vehicle = new Vehicle(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
            vehicle.getInfo();

            /*
             Choose vehicle type.
             */
            try {
                System.out.println("\nTYPE OF VEHICLE: ");
                System.out.print("Input type of vehicle [1: car, 2: airplane, 3:boat, 0:exit]: ");
                int type = input.nextInt();
                switch (type) {
                    case 0 -> {
                        System.out.println("Good bye!");
                        exit = true;
                    }
                    case 1 -> {
                        System.out.print("How many acceleration pulse do you want to execute?: ");
                        int pulses = input.nextInt();
                        Car car = new Car(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
                        car.accelerate(pulses);
                        car.getInfo();
                    }
                    case 2 ->{
                        System.out.print("How many acceleration pulse do you want to execute?: ");
                        int pulses = input.nextInt();
                        Airplane airplane = new Airplane(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
                        airplane.accelerate(pulses);
                        airplane.getInfo();
                        airplane.takeOff();
                    }

                    case 3 -> {
                        System.out.print("How many acceleration pulse do you want to execute?: ");
                        int pulses = input.nextInt();
                        Boat boat = new Boat(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
                        boat.accelerate(pulses);
                        boat.getInfo();
                        boat.dropAnchor();
                    }
                    default -> System.out.println("Only select values between 0 and 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Must input a number.");
            }
        }


    }

}
