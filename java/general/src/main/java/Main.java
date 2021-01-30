import java.util.ArrayList;
import java.util.List;

class Solution {

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

    public List<Integer> mergeTwoLists(int[] a, int[] b) {

        List<Integer> mergedList = new ArrayList<>();
        int left_a = 0;
        int left_b = 0;
        int len_a = a.length-1;
        int len_b = b.length-1;

        while(len_a >= left_a && len_b >= left_b){

            if(a[left_a] >= b[left_b]){
                mergedList.add(b[left_b]);
                left_b++;
                //no bounds left so we add other list last item
                if(len_b < left_b) mergedList.add(a[left_a]);

            }else{
                mergedList.add(a[left_a]);
                left_a++;
                //no bounds left so we add other list last item
                if(len_a < left_a) mergedList.add(b[left_b]);
            }
        }

        return mergedList;
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

