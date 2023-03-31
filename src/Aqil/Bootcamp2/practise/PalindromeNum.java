package Aqil.Bootcamp2.practise;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        // 11211  ==  121211 is plaindrome
        // 11112  ==  121111 is not palindrome

        int number = 0;
        try (Scanner sc = new Scanner(System.in)) {
            number = sc.nextInt();

        }
        boolean isPal = isPalindrome(number);

        if(isPal){
            System.out.println(number + " is palindreome");
        }else {
            System.out.println(number + " is not palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int reverseNum = 0;
        int remainder = 0;
        int currentNumber = num;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num = num/10;
        }
        return currentNumber == reverseNum;
    }
}
