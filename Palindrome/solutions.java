//This code is a solution to check if an integer is a palindrome or not. It first initializes a variable 'count' to 0 and another variable 'n' to the input integer 'x'. Then, it enters a while loop where it repeatedly extracts the last digit of 'n' using the modulo operator (n % 10), adds it to 'count' (by first multiplying 'count' by 10), and removes the extracted digit from 'n' using integer division (n / 10). After the while loop, it checks if the reversed 'count' is equal to the original 'x'. If they are equal, it returns true, indicating that 'x' is a palindrome. If they are not equal, it returns false.
#Auther : Jitendra More
#Number : 9833550438
#Email address : jitendra_ads@yahoo.com


class Solution {
    public boolean isPalindrome(int x) {
        int count = 0;
        int n = x;
        while (n > 0) {
        int temp = n % 10;
        count = (count * 10) + temp;
        n = n / 10;
        }
        if ( x == count) {
            return true;
        }
        return false;
    }
}

