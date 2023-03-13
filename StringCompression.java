import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String compressed = compress(input);
        if (compressed.length() < input.length()) {
            System.out.println(compressed);
        } else {
            System.out.println(input);
        }
    }

    private static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                count = 1;
                prev = current;
            }
        }
        sb.append(prev).append(count);
        return sb.toString();
    }
}
