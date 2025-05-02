package abctech.interview.tasks.arrayutil;

import java.util.ArrayList;

public class ArrayOperations {

    /**
     * Assumes array is not null
     * @param array
     * @return sum of all elements in array
     */
    public int arraySum(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            throw new RuntimeException("ArrayOperations.arrySum - array is empty");
        }

        int sum = 0;
        for (Integer value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * Sorts array passed as variable. Assumes array is not null
     * @param array
     * @return sorted array
     */
    public ArrayList<Integer> sortArray(ArrayList<Integer> array) {

        if (array.isEmpty() || array.size() == 1) {
            return array;
        }

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                if (array.get(i) < array.get(j)) {
                    int temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }

        return array;
    }

    /**
     * Finds and returns array minimum. Assumes array is not null
     * @param array
     * @return
     */
    public int arrayMin(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            throw new RuntimeException("ArrayOperations.arrayMin - array is empty");
        }

        int min = array.get(0);

        for (Integer value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    /**
     * Finds and returns array maximum. Assumes array is not null
     * @param array
     * @return
     */
    public int arrayMax(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            throw new RuntimeException("ArrayOperations.arrayMax - array is empty");
        }

        int max = array.get(0);

        for (Integer value : array) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    /**
     * Calculates and returns arithmetic average of array. Assumes array is not null
     * @param array
     * @return array average
     */
    public double arrayAverage(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            throw new RuntimeException("ArrayOperations.arrayAverage - array is empty");
        }

        int sum = 0;
        for (Integer value : array) {
            sum += value;
        }
        return (double) sum / array.size();
    }
}
