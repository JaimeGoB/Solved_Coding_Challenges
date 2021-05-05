import org.junit.jupiter.api.DisplayName;
import queue.Queue;
import stack.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    private static Solution solution;

    @org.junit.jupiter.api.BeforeAll
    static void init(){
        solution = new Solution();
    }

    /* ****************
     * Merged Two Sorted Lists
     ***************** */
    @org.junit.jupiter.api.DisplayName("Merge Two Sorted Lists")
    @org.junit.jupiter.api.Test
    public void mergeTwoSortedLists(){
        //This test will make sure you get all values
        int[] a = {1,3,4,5};
        int[] b = {2,6,7,8};
        List<Integer> result = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        assertEquals(solution.mergeTwoSortedLists(a,b), result);
    }
    /* ****************
    * 7. Reverse Integer (leetcode)
    ***************** */
    @org.junit.jupiter.api.DisplayName("7. Overflow test")
    @org.junit.jupiter.api.Test
    public void test7(){
        //This number will overflow => func will return 0
        assertEquals(solution.reverse(1534236469),0);
    }

    @org.junit.jupiter.api.DisplayName("7. Regular test")
    @org.junit.jupiter.api.Test
    public void test7_0(){

        assertEquals(solution.reverse(123),321);
    }

    @org.junit.jupiter.api.DisplayName("Code-Signal: adjacentElementsProduct")
    @org.junit.jupiter.api.Test
    public void testAdjecentElementsProduct(){

        //the adjecent product is 21
        int[] inputArray = {3, 6, -2, -5, 7, 3};

        assertEquals(solution.adjacentElementsProduct(inputArray),21);
    }

    @org.junit.jupiter.api.DisplayName("Educative: findSum in O(n)")
    @org.junit.jupiter.api.Test
    public void findSumTest(){

        //result = [21,6] or [6,21]
        int[] result = new int[]{6,21};
        int[] arr = {1,21,3,14,5,60,7,6};

        assertArrayEquals(solution.findSum(arr,27) ,result);
    }

    @org.junit.jupiter.api.DisplayName("Educative: findSum in O(n^2)")
    @org.junit.jupiter.api.Test
    public void findSum2Test(){

        //result = [21,6] or [6,21]
        int[] result = new int[]{21,6};
        int[] arr = {1,21,3,14,5,60,7,6};

        assertArrayEquals(solution.findSum2(arr,27) ,result);
    }

    @org.junit.jupiter.api.DisplayName("N/A: Reverse a CString")
    @org.junit.jupiter.api.Test
    public void reverseCStringTest(){

        char[] arr = new char[]{'H','e','l','l','o',' ','w','o','r','l','d'};
        char[] result = new char[]{'d','l','r','o','w',' ','o','l','l','e','H'};

        assertArrayEquals(solution.reverseCString(arr) ,result);
    }

    @org.junit.jupiter.api.DisplayName("Educative: Reverse words in a string")
    @org.junit.jupiter.api.Test
    public void reverseWordsTest(){

        char[] arr = new char[]{'H','e','l','l','o',' ','w','o','r','l','d'};
        char[] result = new char[]{'w','o','r','l','d',' ','H','e','l','l','o'};

        assertArrayEquals(solution.reverseWords(arr) ,result);
    }
    @org.junit.jupiter.api.DisplayName("Educative: Reverse words in a string. More than 2 words.")
    @org.junit.jupiter.api.Test
    public void reverseWordsTestMoreThanTwoWords(){

        char[] arr    = new char[]{'H','e','l','l','o',' ','t','o', ' ','w','o','r','l','d'};
        char[] result = new char[]{'w','o','r','l','d',' ','t','o', ' ','H','e','l','l','o'};

        assertArrayEquals(solution.reverseWords(arr) ,result);
    }

    @org.junit.jupiter.api.DisplayName("Recursion Challenge 1: Find the Greatest Common Divisor")
    @org.junit.jupiter.api.Test
    public void gcdTest(){
        //gcd(54, 72) => 18
        assertEquals(solution.gcd(54,72) , 18);
    }

    @org.junit.jupiter.api.DisplayName("Recursion Challenge 1: Find the Greatest Common Divisor - NO GCD or GCD = 1")
    @org.junit.jupiter.api.Test
    public void gcdTestNoGCD(){
        //gcd(54, 72) => 18
        assertEquals(solution.gcd(5,3) , 1);
    }

    @org.junit.jupiter.api.DisplayName("Recursion Challenge 2: Is a number prime - prime number")
    @org.junit.jupiter.api.Test
    public void isPrimeTestPrimeNumber(){
        assertTrue(solution.isPrime(5, 5 / 2));
    }
    @org.junit.jupiter.api.DisplayName("Recursion Challenge 2: Is a number prime - composite number")
    @org.junit.jupiter.api.Test
    public void isPrimeTestCompositeNumber(){
        assertFalse(solution.isPrime(6, 6 / 2));
    }

    @org.junit.jupiter.api.DisplayName("stack.Stack Class - pop method")
    @org.junit.jupiter.api.Test
    public void stackTestPop() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        //delete 16, peek => 4
        stack.pop();

        assertEquals(stack.peek(),4);
    }
    @org.junit.jupiter.api.DisplayName("stack.Stack Class - peek method")
    @org.junit.jupiter.api.Test
    public void stackTestPeek() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        assertEquals(stack.peek(),16);
    }
    @org.junit.jupiter.api.DisplayName("stack.Stack Class - isEmpty method")
    @org.junit.jupiter.api.Test
    public void stackTestIsEmpty(){
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        assertFalse(stack.isEmpty());
    }

    @DisplayName("Queue Class - isEmpty method")
    @org.junit.jupiter.api.Test
    public void queueTestIsEmpty(){
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(16);

        assertFalse(queue.isEmpty());
    }

    @DisplayName("Queue Class - dequeue method")
    @org.junit.jupiter.api.Test
    public void queueTestDequeue() throws Exception {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(16);

        assertEquals(queue.dequeue(), 2);
    }

    @DisplayName("Queue Class - top method")
    @org.junit.jupiter.api.Test
    public void queueTestTop() throws Exception {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(16);

        assertEquals(queue.top(), 2);
    }

    @DisplayName("Leetcode: Two Sum - Case 1")
    @org.junit.jupiter.api.Test
    public void twoSum1() {
        int[] nums = new int[]{2,11,7,15};
        int target = 9;
        int[] result = new int[]{0,2};

        assertArrayEquals(result, solution.twoSum(nums, target));
    }

    @DisplayName("Leetcode: Two Sum - Case 2")
    @org.junit.jupiter.api.Test
    public void twoSum2() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] result = new int[]{1,2};

        assertArrayEquals(result, solution.twoSum(nums, target));
    }

    @DisplayName("Leetcode: Is Palindrome - Case 1")
    @org.junit.jupiter.api.Test
    public void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(s));
    }

    @DisplayName("Leetcode: Is Palindrome - Case 2")
    @org.junit.jupiter.api.Test
    public void isPalindromeNotPalindrome() {
        String s = "race a car";
        assertFalse(solution.isPalindrome(s));
    }

    @DisplayName("CodeSignal: Largest Number")
    @org.junit.jupiter.api.Test
    public void Largest_Number()
    {

    }
    /* ***************************
    * LEETCODE - EASY COLLECTION *
    * */
    @DisplayName("Remove Duplicates from Sorted Array")
    @org.junit.jupiter.api.Test
    public void  Remove_Duplicates_from_Sorted_Array()
    {
        int[] Input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] Output = new int[]{0,1,2,3,4};
        assertEquals(Output.length, solution.Remove_Duplicates_from_Sorted_Array(Input));

    }
    @DisplayName("Remove Duplicates from Sorted Array(2)")
    @org.junit.jupiter.api.Test
    public void  Remove_Duplicates_from_Sorted_Array2()
    {
        int[] Input = new int[]{1,1,2};
        int[] Output = new int[]{1,2};
        assertEquals(Output.length, solution.Remove_Duplicates_from_Sorted_Array(Input));

    }

    @DisplayName("Best Time to Buy and Sell Stock II")
    @org.junit.jupiter.api.Test
    public void  Best_Time_to_Buy_and_Sell_Stock_II()
    {
        int[] prices = new int[]{7,1,5,3,6,4};
        assertEquals(7, solution.Best_Time_to_Buy_and_Sell_Stock_II(prices));
    }
    @DisplayName("Best Time to Buy and Sell Stock II(2)")
    @org.junit.jupiter.api.Test
    public void  Best_Time_to_Buy_and_Sell_Stock_II2()
    {
        int[] prices = new int[]{1,2,3,4,5};
        assertEquals(4, solution.Best_Time_to_Buy_and_Sell_Stock_II(prices));
    }

    @DisplayName("Rotate Array")
    @org.junit.jupiter.api.Test
    public void  Rotate_Array()
    {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] output = new int[]{5,6,7,1,2,3,4};
        assertArrayEquals(output, solution.Rotate_Array(nums,k));
    }

    @DisplayName("Contains Duplicate")
    @org.junit.jupiter.api.Test
    public void  Contains_Duplicate()
    {
        int[] nums = new int[]{1,2,3,1};
        Boolean output = true;
        assertEquals(output, solution.Contains_Duplicate(nums));
    }
    @DisplayName("Contains Duplicate(2)")
    @org.junit.jupiter.api.Test
    public void  Contains_Duplicate2()
    {
        int[] nums = new int[]{1,2,3,4};
        Boolean output = false;
        assertEquals(output, solution.Contains_Duplicate(nums));
    }

    @DisplayName("Single Number")
    @org.junit.jupiter.api.Test
    public void Single_Number()
    {
        int[] nums = new int[]{4,4,2,2,1};
        int output = 1;
        assertEquals(output, solution.Single_Number(nums));
    }

}
