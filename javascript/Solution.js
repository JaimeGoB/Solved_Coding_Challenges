class Solution {
    constructor(){}
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
        var result = -1000000;

        //iterate through all product pairs to find highest value
        for(var i = 0; i < inputArray.length-1; i++ ){
            let product = inputArray[i] * inputArray[i+1];
            result = Math.max(result, product);
        }

        return result;
    }

}
module.exports = Solution;

/* ****************
* 7. Reverse Integer (leetcode)
***************** 
var num = 123456;
console.log(solution.reverse(num));

var num = -123456;
console.log(solution.reverse(num));
*/

/* *******************************
* CodeSignal
* find the pair of adjacent elements that 
* has the largest product and return that product.
******************************* */
//const inputArray = [3, 6, -2, -5, 7, 3]
//console.log(solution.adjacentElementsProduct(inputArray ));


