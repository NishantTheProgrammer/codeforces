import java.util.HashSet;
import java.util.Scanner;

public class Day5BoyOrGirl {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine().trim();
            HashSet<Character> uniqueCharacters = new HashSet<Character>();

            for(int i = 0; i < word.length(); i++) {
                uniqueCharacters.add(word.charAt(i));
            }
            if(uniqueCharacters.size() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
            sc.close();
        }
    }
}
