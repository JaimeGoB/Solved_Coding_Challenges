import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
