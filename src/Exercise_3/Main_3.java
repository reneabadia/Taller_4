package Exercise_3;

public class Main_3 {

    public static void main(String[] args){

        /*
        Create a random array of size 'n' and between 'lowLim' and 'supLim' limits.
        And to print this random array.
         */
        sortRandomArray R = new sortRandomArray();
        double[] randomArray = R.createArray(6,1,100);
        System.out.print("\nOriginal array: ");
        R.printArray(randomArray);

        /*
        Sort the generated random array and print it.
         */
        double[] sortedArray = R.bubbleArray();
        System.out.print("\nSorted array: ");
        R.printArray(sortedArray);
        System.out.println();

    }


}
