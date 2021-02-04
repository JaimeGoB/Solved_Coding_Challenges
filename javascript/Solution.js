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
}

module.exports = Solution;
