import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //problem 1
        int[] testArray = new int[5];
        testArray[0] = 0;
        testArray[1] = 3;
        testArray[2] = 10;
        testArray[3] = 7;
        testArray[4] = 18888;

        printArray(findLargestAndSmallest(testArray));

        //problem 2
        List<Integer> testList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            testList.add(i);
        }
        System.out.println(sumOfTwoLargest(testList));

        List<Integer> testOne = new ArrayList<>();
        testOne.add(5);
        System.out.println(sumOfTwoLargest(testOne));

        //problem 3
        List<Integer> intList = new ArrayList<>();
        intList.add(9);
        intList.add(null);
        intList.add(9);
        intList.add(100);
        intList.add(9);

        System.out.println(intList);
        System.out.println(removeDuplicatesFromList(intList));


    }

    //helper method to print everything in arrays
    public static void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    /**
     * Question 1: Find the smallest and largest numbers in an array
     * <p>
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the smallest and the largest.
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int array[]) {

        int[] newArray = new int[2];

        int smallest = array[0];
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {
                largest = array[i];
                newArray[0] = largest;
            } else if (array[i] <= smallest) {
                smallest = array[i];
                newArray[1] = smallest;
            }

        }
        return newArray;
    }


    /**
     * Questions 2
     * <p>
     * Given a List of Integers, return the sum of the two largest values.
     * <p>
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * @param intList A List of integers of any size.
     * @return Sum of the two largest values
     */
    public static int sumOfTwoLargest(List intList) {

        if (intList.size() == 0) {
            return 0;
        } else if (intList.size() == 1) {
            return (int) intList.get(0);
        } else {
            Collections.sort(intList);

            return (int) intList.get(intList.size() - 1) + (int) intList.get(intList.size() - 2);
        }
    }


     /**
      * Question3: Remove duplicates from a List
      *
      * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
      * and return a List that doesn't contain duplicates. The order of the elements in the original List
      * does not need to be kept the same.
      *
      * You MAY use any collections types you wish, but the method must return a List.
      *
      * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
      *
      * @param intList A List of Integers that may or may not include duplicates
      * @return A List of Integers that doesn't contain duplicates.
      */
     public static List removeDuplicatesFromList(List intList){

         List<Integer> newList = new ArrayList<>();
         

         for (int i = 0; i < intList.size(); i++) {
             if (!(newList.contains(intList.get(i)))){
                 newList.add((Integer) intList.get(i));
             }

         }
         return newList;



     }
}


    // //BONUS QUESTION IS BELOW

    // /**
    //  * BONUS:
    //  *
    //  * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
    //  * All valid numbers in these arrays are greater than 0.
    //  *
    //  * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
    //  * combined. The returned array must be array1 with the new values merged in.
    //  *
    //  * For example:
    //  *      array1 = [1,4,7,9,0,0,0]
    //  *      array2 = [1,5,11]
    //  *      returned array = [1,1,4,5,7,9,11]
    //  *
    //  * No test cases are provided for this method, you will need to test it on your own.
    //  *
    //  * @param array1 Array of sorted integers
    //  * @param array2 Array of sorted integers
    //  * @return Array of sorted integers, merged from array1 and array2
    //  */
    // public static int[] mergeSortedArrays(int[] array1, int[] array2){
    //     return null;
    // }

