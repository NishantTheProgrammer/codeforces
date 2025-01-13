import java.util.Scanner;

public class Day9Word {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine().trim();
            int count = 0;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) < 97) {
                    count++;
                }
            }
            if((word.length() - count) < count) {
                System.out.println(word.toUpperCase());
            } else {
                System.out.println(word.toLowerCase());
            }
            sc.close();
        }
    }
}
