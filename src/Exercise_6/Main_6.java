package Exercise_6;
import java.util.Scanner;

public class Main_6{

    public static void main(String[] arg){

        // Define vector object of class 'fillVector'
        fillVector vector = new fillVector();

        // Define scanner object to get values of terminal.
        Scanner input = new Scanner(System.in);

        /*
        Define condition variable to continue loop of add elements.
        Define index of vector.
         */
        boolean condition;
        int i = 0;

        /*
        Loop to add elements to vector with 'addNumber' method.
        And check if last two numbers are the same with method 'continueAdd';
         */
         do {
            System.out.print("Input a integer for adding to vector: ");
            int number = input.nextInt();
            vector.addNumber(number);
            condition = vector.continueAdd(i);
            i++;
        } while(condition);

        /*
        Call method to print the vector.
         */
        fillVector.printVector();
        System.out.println();

    }

}
