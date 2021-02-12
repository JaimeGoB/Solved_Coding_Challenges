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