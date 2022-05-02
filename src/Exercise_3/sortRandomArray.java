package Exercise_3;

/**
 * Class to create a random array with method sort it by Bubble Algorithm.
 */
public class sortRandomArray{

    /**
     * Native variable
     */
    double[] Array;


    /**
     * Method to create an array of random real numbers.
     * @return generated random array as double variable.
     */
    public double[] createArray(int n, double lowLimit, double supLimit) {

        double[] numbers = new double[n];
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = Math.random() * supLimit + lowLimit;
        }
        return this.Array = numbers;
    }


    /**
     * Method to get generated array.
     * @return double array.
     */
    public double[] getArray() {
        return this.Array;
    }


    /**
     * Method to sort generated array numbers by Bubble Algorithm.
     * @return the sorted array.
     */
    public double[] bubbleArray(){

        int i,j;
        double aux;
        double[] A = this.getArray();

        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;

    }


    /**
     * Method to print an array.
     */
    public void printArray(double[] Array){
        for (double v : Array) {
            System.out.print(v + ", ");
        }
    }


}


