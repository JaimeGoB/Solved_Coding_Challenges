const Solution = require('../Solution');
  

/* ****************
* Merged Two Sorted Lists
***************** */
describe('Merged Two Sorted Lists', () =>{
    test('Test when one list is DRASTICALLY shorter than the other', () => {

        let solution = new Solution();
        const a = [1,3,4,5];
        const b = [2,6,7,8];
        let result = [1,2,3,4,5,6,7,8];

        expect(solution.mergedTwoSortedLists(a,b)).toEqual(expect.arrayContaining(result));
    })
})

/* ****************
* 7. Reverse Integer (leetcode)
***************** */
describe('Leetcode: 7.reverseInteger', () =>{
    test('Test function can reverse a postive integer', () => {
        let solution = new Solution();
        var num = 123456;
        expect(solution.reverse(num)).toEqual(654321);

    })

    test('Test function can reverse a negative integer', () => {
        let solution = new Solution();
        var num = -123456;
        expect(solution.reverse(num)).toEqual(-654321);

    })
})
/* *******************************
* CodeSignal
* find the pair of adjacent elements that 
* has the largest product and return that product.
******************************* */
describe('CodeSignal: adjecementElementsProduct', () =>{
    test('Test to make sure product is correct', () =>{
        let solution = new Solution();
        const inputArray = [3, 6, -2, -5, 7, 3]
        expect(solution.adjacentElementsProduct(inputArray) ).toEqual(21);
    })
})

/* *******************************
* Educative
* Find Two Numbers that Add up to "n"
* return pair of numbers if it exists else return array
* O(n^2)
* Brute force method will try every single possible combination.
******************************* */
describe('Educative: find two numbers that Add up to "n" ', () =>{
    test('Test to make sure Brute Force Method works', () =>{
        let solution = new Solution();
        const inputArray = [1,21,3,14,5,60,7,6]
        const n = 27;
        expect(solution.findSum2(inputArray, n) ).toEqual([21,6]);
    })
})

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
describe('Educative: find two numbers that Add up to "n" ', () =>{
    test('Test to make sure Brute Force Method works', () =>{
        let solution = new Solution();
        const inputArray = [1,21,3,14,5,60,7,6]
        const n = 27;
        expect(solution.findSum(inputArray, n) ).toEqual([21,6]);
    })
})

describe('General Test - Reverse a string', () =>{
    test('Reverse a CString.', () =>{
        let solution = new Solution();
        let arr = ['H','e','l','l','o',' ','w','o','r','l','d'];
        let result = ['d','l','r','o','w',' ','o','l','l','e','H'];

        expect(solution.reverseString(arr) ).toEqual(result);
    })
})

describe('Educative - Reverse words in a string', () =>{
    test('Reverse words given a cstring.', () =>{
        let solution = new Solution();
        let arr =    ['H','e','l','l','o',' ','w','o','r','l','d'];
        let result = ['w','o','r','l','d',' ','H','e','l','l','o'];

        expect(solution.reverseWords(arr)).toEqual(result);
    })
})

describe('General - Fibonacci', () =>{
    test('5 gets 5 ', () =>{

        let solution = new Solution();
        expect(solution.fibonacci(5)).toEqual(5);
    })
    test('12 gets 144 ', () =>{

        let solution = new Solution();
        expect(solution.fibonacci(5)).toEqual(5);
    })
})


describe('Educative Recursion - Find Greatest Common Divisor', () =>{
    test('Getting a GCD ', () =>{
        
        let solution = new Solution();
        expect(solution.gcd(54,72)).toEqual(18);
    })
    test('NO GCD or GCD is 1 ', () =>{
        
        let solution = new Solution();
        expect(solution.gcd(5,3)).toEqual(1);
    })
})

describe('Educative Recursion - isPrime return true if so', () =>{
    test('Testing a prime number', () =>{
        
        let solution = new Solution();
        expect(solution.isPrime(5,5/2)).toBeTruthy();
    })
    test('Testing a composite number', () =>{
        
        let solution = new Solution();
        expect(solution.isPrime(4,4/2)).toBeFalsy();
    })
})

describe('TwoSum - Leetcode', () =>{
    test('Test 1 - General Case', () =>{
        
        let solution = new Solution();
        const nums = [2,7,11,15];
        const target = 9;
        let result = [0,1];

        expect(solution.twoSum(nums,target)).toEqual(result);
    })

    test('Test 2 - When one index is the last value', () =>{
        
        let solution = new Solution();
        const nums = [3,2,4];
        const target = 6;
        let result = [1,2];

        expect(solution.twoSum(nums,target)).toEqual(result);
    })

})


describe('Leetcode Easy Collection - Remove Duplicates from Sorted Array', () =>{
    test('Test 1 - Short Array', () =>{
        
        let solution = new Solution();
        const nums = [1,1,2];
        const result = 2;

        expect(solution.Remove_Duplicates_from_Sorted_Array(nums)).toEqual(result);
    })

    test('Test 2 - Long array', () =>{
        
        let solution = new Solution();
        const nums = [0,0,1,1,1,2,2,3,3,4];
        const result = 5

        expect(solution.Remove_Duplicates_from_Sorted_Array(nums)).toEqual(result);
    })
})

describe('Leetcode Easy Collection - Best Time to Buy and Sell Stock II', () =>{
    test('Test 1', () =>{
        
        let solution = new Solution();
        const nums = [7,1,5,3,6,4];
        const result = 7;

        expect(solution.Best_Time_to_Buy_and_Sell_Stock_II(nums)).toEqual(result);
    })

    test('Test 2', () =>{
        
        let solution = new Solution();
        const nums = [1,2,3,4,5];
        const result = 4;

        expect(solution.Best_Time_to_Buy_and_Sell_Stock_II(nums)).toEqual(result);
    })
})