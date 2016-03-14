/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {
    public class Solution {
        public int addDigits(int num) {
            int number = num;
            while(number >= 10) {
                int digitAccumulator = 0;
                while (number >= 10) {
                    digitAccumulator += number % 10;
                    number = number / 10;
                }
                
                number += digitAccumulator;
            }

            return number;
        }
    }
}
