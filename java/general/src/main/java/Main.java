import java.util.ArrayList;
import java.util.List;

class Solution {

    /* ****************
     * Merged Two Sorted Lists
     ***************** */
    public List<Integer> mergeTwoSortedLists(int[] arr1, int[] arr2) {

        List<Integer> mergedList = new ArrayList<>();
        int iterator1 = 0;
        int iterator2 = 0;

        /*This for loop will finish one list but NOT THE OTHER LIST
         * IF THE OTHER LIST HAS MORE THAN 1 VALUE LEFT.*/
        while(iterator1 < arr1.length && iterator2 < arr2.length ){
            //check which value is bigger
            if(arr1[iterator1] >= arr2[iterator2]){
                //store value in list
                mergedList.add(arr2[iterator2]);
                iterator2++;

            }else{
                //store value in list
                mergedList.add(arr1[iterator1]);
                iterator1++;
            }
        }

        //Finish list 1 if not already finished
        while(iterator1 < arr1.length){
            mergedList.add(arr1[iterator1++]);
        }

        //Finish list 2 if not already finished
        while (iterator2 < arr2.length){
            mergedList.add(arr2[iterator2++]);
        }

        return mergedList;
    }
    /****************************
     * 7. Reverse Integer (leetcode)
     *****************************/
    public int reverse(int x) {


        //converting num to string
        String num =Integer.toString(x);
        int result = 1;

        int start = 0;
        StringBuilder result_temp = new StringBuilder();


        //Case 1: Length of 1
        if(num.length() == 1)
            return x;

        //Case 1: Length of 2 or more
        /*
        * Note we have two subcases here:
        * case 1A: integer is negative
            add "-" to string and skip this char
            when iterating through string.
        * case 1B: integer is positive
            Iteratre through string
        */
        if(x < 0){
            result_temp.append("-");
            start = 1;
        }

        //iterate through remaining characters
        for(int i = num.length() -1; i >= start; i--){
            result_temp.append(num.charAt(i));
        }

        //converting string to int
        try{
            result = Integer.parseInt(result_temp.toString());
        }catch(Exception e){
            result = 0;
        }

        return result;
    }
    /* *******************************
     * CodeSignal
     * find the pair of adjacent elements that has the largest product and return that product.
     ******************************* */
    int adjacentElementsProduct(int[] inputArray) {

        //set max value to lowest min value
        int result = -1000000;
        //iterate index plus neighbor to find max product
        for(int i = 0; i < inputArray.length -1; i++ ){
            //calculate product of index + right_neighbor
            int product = inputArray[i] * inputArray[i +1];
            result = Math.max(result,product);
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

    }
}

