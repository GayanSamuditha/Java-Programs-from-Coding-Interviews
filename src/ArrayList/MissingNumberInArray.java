package ArrayList;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:45 AM
 * Let's understand the problem statement, we have numbers from 1 to 100 that are put into an integer array,
 * what's the best way to find out which number is missing? If Interviewer especially mentions 1 to 100 then you
 * can apply the above trick about the sum of the series as shown below as well. If it has more than one missing element
 * that you can use BitSet class, of course only if your interviewer allows it.
 *
 * 1) Sum of the series: Formula: n (n+1)/2( but only work for one missing number)
 * 2) Use BitSet, if an array has more than one missing elements.
 *
 * I have provided a BitSet solution with another purpose, to introduce with this nice utility class. In many interviews, I have asked about this class to Java developers, but many of them not even aware of this. I think this problem is a nice way to learn how to use BitSet in Java as well.
 *
 *
 *
 */



public class MissingNumberInArray {

    public static void main(String args[]) {

        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);

        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);

        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);

        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);

        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(iArray), missing);

    }





    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }



    /**
     * Java method to find missing number in array of size n containing
     * numbers from 1 to n only.
     * can be used to find missing elements on integer array of
     * numbers from 1 to 100 or 1 - 1000
     */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

}
