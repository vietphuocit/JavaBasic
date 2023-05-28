package algorithm;

public class SumBigNumbers {
    public static String sum(String num1, String num2) {
        String reversedNum1 = reverseString(num1);
        String reversedNum2 = reverseString(num2);

        String result = "";
        int carry = 0;
        for (int i = 0; i < Math.max(reversedNum1.length(), reversedNum2.length()); i++) {
            int digit1 = i < reversedNum1.length() ? Character.getNumericValue(reversedNum1.charAt(i)) : 0;
            int digit2 = i < reversedNum2.length() ? Character.getNumericValue(reversedNum2.charAt(i)) : 0;
            int tempSum = digit1 + digit2 + carry;
            carry = tempSum >= 10 ? 1 : 0;
            result = (tempSum % 10) + result;
        }

        if (carry == 1) {
            result = "1" + result;
        }

        return result;
    }

    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String num1 = "12345678901234567890";
        String num2 = "98765432109876543210";
        System.out.println(sum(num1, num2));  // Kết quả: 111111111011111111100
    }
}

