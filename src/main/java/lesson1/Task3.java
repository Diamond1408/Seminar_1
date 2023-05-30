package lesson1;

public class Task3 {
    public static void main(String[] args) {
        int n = 7;
        char c1 = 'A';
        char c2 = 'B';
        String result = alternatingChars(n, c1, c2);
        System.out.println(result);
    }
    public static String alternatingChars(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString(); // convert the StringBuilder object to a string and return it
    }
}

