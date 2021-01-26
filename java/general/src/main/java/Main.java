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
}

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        /* ****************
         * 7. Reverse Integer (leetcode)
         *****************
        int x = 1534236469;
        int x = 123;
        System.out.println(solution.reverse(x));
        */


    }
}

