import java.util.*;

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

    /* *******************************
     * Educative
     * Find Two Numbers that Add up to "n"
     * O(n)
     * This is the best method to do this.
     * We know that n is sum of two numbers
     * n = n1+n2 <=> n-n1 = n2
     * As we iterate array arr with (n1)
     * we check if the difference (n-n1) is contained(=) in n2
     * if so return it, otherwise add element from array (n1) to n2 set.
     * We do this to find reciprocal values:
     * 4-1=3 <=> 4-3=1
     ******************************* */
    public int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        Set<Integer> n2 = new HashSet<Integer>();

        for (int n1 : arr) {
            //n-n1 = n2
            if (n2.contains(n - n1)) {
                result[0] = n1;
                result[1] = n - n1;
                return result;
            }
            n2.add(n1);
        }
        return arr;
    }

    /* *******************************
     * Educative
     * Find Two Numbers that Add up to "n"
     * O(n^2)
     * Brute force method will try every single possible combination.
     ******************************* */
    public int[] findSum2(int[] arr, int n)
    {
        int[] result = new int[2]; // to store the pair of values.

        for (int i = 0; i < arr.length; i++) { //traverse arr
            for (int j = i + 1; j < arr.length; j++) { //traverse arr again
                if (arr[i] + arr[j] == n) { // find where sum is equal to n
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }
        return arr;
    }
    /*
     * Reverse the CString
     * */
    public char[] reverseCString (char[] sentence) {
        //create cstring to store reversed characters
        char[] reversed_sentence = new char[sentence.length];
        //iterate through end of array and return
        //(sentence.length-1) - i WILL GO from 0 to (sentence.length-1)
        //will i goes from (sentence.length-1) to 0
        for(int i = sentence.length-1; i >= 0; i--){
            reversed_sentence[(sentence.length-1) - i] = sentence[i];
        }

        return reversed_sentence;
    }
    /*
     * Educative
     * Reverse the order of words in a given sentence (an array of characters (cstring)):
     * Hello world -> world Hello
     * */
    public char[] reverseWords (char[] sentence) {
        //create cstring to store reversed characters
        char[] reversed_sentence = new char[sentence.length];

        //variables to get substrings
        int end = sentence.length;
        int index = 0;

        //iterate cstring from end to beginning
        for(int start = sentence.length-1; start >= 0; start--){

            //sentence array does not start with a space
            if(start == 0 && sentence[start] != ' '){
                //case the word does not end with ' '
                for(int substringIndex = start; substringIndex  < end; substringIndex++){
                    reversed_sentence[index++] = sentence[substringIndex];
                }
                break;
            }

            //check if current char is a space
            if(sentence[start] == ' '){
                //add substring to reversed_sentence array
                for(int substringIndex  = start+1; substringIndex  < end; substringIndex++){
                    reversed_sentence[index++] = sentence[substringIndex];
                }
                //add space to end of word
                reversed_sentence[index++] = ' ';
                //update end
                end = start;
            }
        }

        return reversed_sentence;
    }

    //Remember Fibonacci sequence:
    // F = F(n-1) + F(n-2)
    public int fibonacci(int n) {
        //If negatives are allowed use <= 0
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    /*
    * Recursion Challenge 1: Find the Greatest Common Divisor
    * Given an input of two ints find their gcd
    * Ex: gcd(18, 24) => 6 , gcd(54, 72) => 18
    */
    public int gcd(int a, int b)
    {
        //base case
        if(b == 0)
            return a;
        //recursive case
        return gcd(b, a % b);
    }

    /*
     * Recursion Challenge 2: Is a number prime
     * Given an input of two ints  n and n/2 , using recursion check if number is prime.
     * Prime numbers: 2,3,5,7,11,13,17,19,23,29
     * Only divisble by n and 1.
     */
    public boolean isPrime(int n, int n_div_2) {

        //check the number is divisible by n_div_2 and n_div_2 IS NOT 1 => Composite #
        if(n % n_div_2 == 0 && n_div_2 != 1)
            return false;
        //go from (n/2) to 2 in decreasing form
        if(n_div_2 > 1)
            return isPrime(n, --n_div_2);

        //the number is prime
        return true;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        while(!stack.isEmpty())
            System.out.println(stack.pop());



    }
}

