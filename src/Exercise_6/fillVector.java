package Exercise_6;

import java.util.Vector;

public class fillVector {

    /**
     * Create vector instance
      */
    static Vector<Integer> vector = new Vector<>();

    /**
     * Method to add element to vector.
     * @param number integer element of vector.
     */
    public void addNumber(int number){
        vector.add(number);
    }

    /**
     * Boolean method to evaluate condition of continuity.
     * If last two elements are the same the method return 'false'.
     * @param index position in vector.
     * @return true to continue, false to exit.
     */
    public boolean continueAdd(int index){

        if (index > 0) {
            int last = vector.get(index);
            int past = vector.get(index - 1);

            if (last==past){
                System.out.println("\nRepeated number. Exiting.");
                return false;
            }
            else {
                return true;
            }

        }

        return true;
    }

    /**
     * Method to print vector.
     */
    public static void printVector(){
        System.out.print("Vector is: ");
        vector.forEach(element -> System.out.print(+element + ", "));
    }


}
