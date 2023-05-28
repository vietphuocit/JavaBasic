package algorithm;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "level";
        if (isPalindrome(s)) {
            System.out.println(s + " là chuỗi palindrome.");
        } else {
            System.out.println(s + " không phải là chuỗi palindrome.");
        }
    }
}
