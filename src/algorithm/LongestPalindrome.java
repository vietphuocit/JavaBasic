package algorithm;

public class LongestPalindrome {
    public static void main(String[] args) {
        String inputString = "cabbacdfgdcabac";
        String longestPalindrome = findLongestPalindrome(inputString);
        System.out.println("Chuỗi palindrome dài nhất là: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String str) {
        int n = str.length();
        String longestPalindrome = "";

        // Kiểm tra tất cả các chuỗi con của chuỗi ban đầu
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = str.substring(i, j);
                if (PalindromeChecker.isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                    longestPalindrome = subStr;
                }
            }
        }

        return longestPalindrome;
    }
}
