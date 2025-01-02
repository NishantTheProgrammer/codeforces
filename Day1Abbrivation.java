import java.util.Scanner;

public class Day1Abbrivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline after reading n

        for(int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if(word.length() > 10) {
                String abbr = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbr); 
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}