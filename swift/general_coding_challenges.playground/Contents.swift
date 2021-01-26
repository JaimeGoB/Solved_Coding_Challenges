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
}

var solution:Solution = Solution()

/* ****************
 * 7. Reverse Integer (leetcode)
 *****************
print(solution.reverse(x: 1534236469))
print(solution.reverse(x: 123))
*/


