import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day7StringTask {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine().trim();
            StringBuilder sb = new StringBuilder();
            Set<Character> vovels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'));


            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(vovels.contains(ch)) continue;
                sb.append('.');
                sb.append(Character.toLowerCase(ch));
            }
            
            System.out.println(sb);
            sc.close();
        }
    }
}
