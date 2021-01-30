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

}

let solution = new Solution();

/* ****************
* 7. Reverse Integer (leetcode)
***************** 
var num = 123456;
console.log(solution.reverse(num));

var num = -123456;
console.log(solution.reverse(num));
*/

