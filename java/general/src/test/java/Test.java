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

    @org.junit.jupiter.api.DisplayName("Stack Class - pop method")
    @org.junit.jupiter.api.Test
    public void stackTestPop() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        //delete 16, peek => 4
        stack.pop();

        assertEquals(stack.peek(),4);
    }
    @org.junit.jupiter.api.DisplayName("Stack Class - peek method")
    @org.junit.jupiter.api.Test
    public void stackTestPeek() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(16);

        assertEquals(stack.peek(),16);
    }
    @org.junit.jupiter.api.DisplayName("Stack Class - push method")
    @org.junit.jupiter.api.Test
    public void stackTestPush(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(16);


    }
    @org.junit.jupiter.api.DisplayName("Stack Class - isEmpty method")
    @org.junit.jupiter.api.Test
    public void stackTestIsEmpty(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(16);


    }
}
