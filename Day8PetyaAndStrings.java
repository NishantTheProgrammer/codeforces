import java.util.Scanner;

public class Day8PetyaAndStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String w1 = sc.nextLine().trim().toLowerCase();
            String w2 = sc.nextLine().trim().toLowerCase();
            byte result = 0;
            for(int i = 0; i < w1.length(); i++) {
                if(w1.charAt(i) < w2.charAt(i)) {
                    result = -1;
                    break;
                } else if(w1.charAt(i) > w2.charAt(i)) {
                    result = 1;
                    break;
                }
            }

            
            System.out.println(result);
            sc.close();
        }
    }
}
