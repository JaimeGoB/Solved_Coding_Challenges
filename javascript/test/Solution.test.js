const Solution = require('../Solution');
  

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

