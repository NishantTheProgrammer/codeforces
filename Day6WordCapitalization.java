import java.util.Scanner;

public class Day6WordCapitalization {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine().trim();
            
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
            sc.close();
        }
    }
}
