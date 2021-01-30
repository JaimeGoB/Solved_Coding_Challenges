import UIKit


class Solution {
    
    /* ****************
     * 7. Reverse Integer (leetcode)
     ***************** */
    func reverse(x : Int) -> Int32 {
        
        let num = String(x)
        var resultTemp:String = ""
        
        //Check if size of string is one
        if(num.count == 1){
            return Int32(x)
        }
        
        //check if the number is negative
        if(x < 0){
            resultTemp.append("-")
        }
        
        //iterating through reverse string and adding characters to string
        for char in num.reversed() {
            if( char != "-"){
                resultTemp.append(char)
            }
        }
        
        //converting string back to int
        let result = Int32(resultTemp) ?? 0
        
        return result
    }
    
    /* *******************************
     * CodeSignal
     * find the pair of adjacent elements that has the largest product and return that product.
     ******************************* */
    func adjacentElementsProduct(inputArray : Array<Int>) ->Int {
        
        //let max be the lowest possible value in range
        var result:Int = -1000000
        
        //iterate through product pairs and store max value between all values in array
        for i in 0 ..< inputArray.count-1 {
            let product:Int = inputArray[i] * inputArray[i+1]
            result = max(result, product)
        }
        
        return result
    }
}

var solution:Solution = Solution()

/* ****************
 * 7. Reverse Integer (leetcode)
 *****************
print(solution.reverse(x: 1534236469))
print(solution.reverse(x: 123))
*/

let inputArray = [3, 6, -2, -5, 7, 3]
print(solution.adjacentElementsProduct(inputArray : inputArray))

