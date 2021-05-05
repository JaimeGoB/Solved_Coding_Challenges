class Solution {
    constructor(){}

    /* ****************
     * Merged Two Sorted Lists
     ***************** */
    mergedTwoSortedLists(arr1,arr2){
        let result = [];
        let iterator1 = 0;
        let iterator2 = 0;

        //This for loop will make sure to get all values from 1 list
        while(iterator1 < arr1.length && iterator2 < iterator2.length){
            //check for smaller value, once found move iterate to next value
            if(arr1[iterator1] >= arr2[iterator2]){
                result.push(arr2[iterator2]);
                iterator2++;
            }else{
                result.push(arr1[iterator1]);
                iterator1++;
            }
        }

        /* Finish adding remaining values of leftover list
        * There could be 1 or more values left on this list. */
        while(iterator1 < arr1.length){
            result.push(arr1[iterator1++]);
        }

        while(iterator2 < arr2.length){
            result.push(arr2[iterator2++]);
        }

        

        return result;
    }
    /* ****************
     * 7. Reverse Integer (leetcode)
     ***************** */
    reverse(num){
        const num_str = num.toString();
        var result_str = "";
        var result = 0;
        var index = 0;

        //check if number is negative
        if(num < 0){
            result_str += "-";
            index++;
        }

        //iterate through num_string and reverse
        for(var i = num_str.length-1; i >= index; i--){
            if(num_str[i] != "-")
                result_str += num_str[i];
        }

        //change string back to int
        result = parseInt(result_str);

        return result;
    }

    /* *******************************
     * CodeSignal
     * find the pair of adjacent elements that has the largest product and return that product.
     ******************************* */
    adjacentElementsProduct(inputArray) {
        //let max be lowest value in range
        let result = -1000000;

        //iterate through all product pairs to find highest value
        for(let i = 0; i < inputArray.length-1; i++ ){
            let product = inputArray[i] * inputArray[i+1];
            result = Math.max(result, product);
        }
        
        return result;
    }

    /* *******************************
     * Educative
     * Find Two Numbers that Add up to "n"
     * return pair of numbers if it exists else return array
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
    findSum(arr,n)
    {
        //use to store pair if it exists
        var result = [];
        // hashtable will be n2
        // n = n1 + n2 <=> n - n1 = n2
        var n2 = new Set();

        //Look for n2 from n-n1 where n1 is all values from array
        for(var i = 0; i < arr.length; i++){
            let n1 = arr[i];
            //found a pair that satisfies equation
            if(n2.has(n-n1)){
                result = [n-n1, n1];
                return result;
            }
            //add n1 to n2 set to find new values of n1 that satisfy equation
            n2.add(n1);
        }

        return arr;
    }

    /* *******************************
     * Educative
     * Find Two Numbers that Add up to "n"
     * return pair of numbers if it exists else return array
     * O(n^2)
     * Brute force method will try every single possible combination.
     ******************************* */
    findSum2(arr,n)
    {
        //create empty array to hold pair
        var result = []

        //Brute force check sum of all possible comibaniations
        for(var i = 0; i < arr.length-1; i++){
            for(var j = i + 1; j < arr.length; j++){
                if(n == arr[i] + arr[j]){
                    result = [arr[i], arr[j]];
                    return result;
                }
            }
        }
        return arr;
    }

    /*
     * Reverse a String
     */
    reverseString(arr)
    {
        let reversed_string = [];

        for(var i = arr.length-1; i >= 0; i--){
            reversed_string.push(arr[i]);
        }

        return reversed_string;
    }

    /* *******************************
     * Educative
     * Reverse words in a cstring.
     * Ex: Hello world => world Hello
     ******************************* */
    reverseWords(arr)
    {
        //variables needed to solve
        let reversedSentece = [];
        let end = arr.length;

        //traverse string to get subtrings
        for(let start = arr.length-1; start >= 0; start--){

            //Case 2: Get Last Substring not ending in space (1st char in cstring)
            if(start == 0 && arr[start] != ' '){
                //Iterate from start to end the last substring (1st string in cstring)
                for(let subString = start; subString < end; subString++){
                    reversedSentece.push(arr[subString]);
                }
                break;
            }

            //Case 1: Check for spaces and reverse word and space
            if(arr[start] == ' '){
                //Iterate through substring from start to end and store into rSentence
                for(let subStringIndex = start+1; subStringIndex < end; subStringIndex++ ){
                    reversedSentece.push(arr[subStringIndex]);
                }
                //adding space and moving end to new 
                reversedSentece.push(' ');
                //move end to the index of space (start is where space is at)
                end = start;
            }
        }

        return reversedSentece;
    }

    //Remember Fibonacci sequence:
    // F = F(n-1) + F(n-2)
    fibonacci(n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        
        return (this.fibonacci(n-1) + this.fibonacci(n-2));
    }

    /*
    * Recursion Challenge 1: Find the Greatest Common Divisor
    * Given an input of two ints find their gcd
    * Ex: gcd(18, 24) => 6 , gcd(54, 72) => 18
    */
    gcd(a,b)
    {
        if(b == 0)
            return a;
        
        return this.gcd(b, a % b);
    }

    /*
     * Recursion Challenge 2: Is a number prime
     * Given an input of two ints  n and n/2 , using recursion check if number is prime.
     * Prime numbers: 2,3,5,7,11,13,17,19,23,29
     * Only divisble by n and 1.
     */
    isPrime(n,n_div_2)
    {
        //round number down to an int
        n_div_2 = Math.floor(n_div_2);

        //check number is divisible by n_div_2 and n_div_2 is not 1
        if(n % n_div_2 == 0 && n_div_2 != 1)
            return false;
        //go from (n/2) to 2 in decreasing order
        if(n_div_2 > 1)
            return this.isPrime(n,--n_div_2);

        //number is prime
        return true;
    }
    
    twoSum(nums,target)
    {
        let result = [];
        let hashMap = new Map();

        for(let i = 0; i < nums.length; i++){
            if(hashMap.has(target - nums[i])){
                return result = [ hashMap.get(target - nums[i]), i];
            }
            hashMap.set(nums[i], i);
        }

        return result;
    }

    Remove_Duplicates_from_Sorted_Array(nums)
    {
        if(nums.length == 0) return 0;

        //Start at first value from array
        let result = 0;

        for( let i = result+1; i < nums.length; i++){
            if(nums[i] != nums[result])
                nums[++result] = nums[i];
        }

        return ++result;
    }

    Best_Time_to_Buy_and_Sell_Stock_II(nums)
    {
        let profit = 0;
        //Buy and Sell immediately ONLY if the price goes up
        for(let i = 1; i < nums.length; i++)
            profit += Math.max(0,nums[i] - nums[i-1]);

        return profit;
    }

    reverse_arr(nums, l, r)
    {
        while(l < r){
            let temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp; 
        }
    }

    Rotate_Array(nums,k)
    {
        //Step 1 - Calculate exact rotations
        let split = k % nums.length;   

        //Step 2 - Check for split or k being 0
        if(k == 0 || split == 0)
            return nums;

        //Step 3 - Reverse entire array, until k, until end
        this.reverse_arr(nums, 0, nums.length-1);
        this.reverse_arr(nums, 0, split-1);
        this.reverse_arr(nums, split, nums.length-1);

        return nums;
    }

    Single_Number(nums)
    {
        let result = 0;
        for(let i = 0; i < nums.length; i++)
            result ^= nums[i];
        
        return result;
    }


}

module.exports = Solution;


