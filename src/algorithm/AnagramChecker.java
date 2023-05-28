package algorithm;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        if (isAnagram(str1, str2)) {
            System.out.println("Hai chuỗi là anagram của nhau");
        } else {
            System.out.println("Hai chuỗi không phải là anagram của nhau");
        }
    }
}
