package algorithm;

public class CountChar {
    public static void main(String[] args) {
        String str = "Hello World";
        int count;

        System.out.println("Các ký tự trùng lặp trong chuỗi " + str + " là:");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                    str = str.substring(0, j) + ' ' + str.substring(j + 1);
                }
            }

            System.out.println(str.charAt(i) + " xuất hiện " + count + " lần");
        }
    }
}
