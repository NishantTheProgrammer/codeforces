import java.util.Scanner;

public class Day4BeautifulMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i < 5; i++) {
                int charIndex = sc.nextLine().replace(" ", "").indexOf('1');
                if(charIndex > -1) {
                    int result = Math.abs(2 - charIndex) + Math.abs(2 - i);
                    System.out.println(result);
                    return;
                }
            } 
            sc.close();
        }
    }
}
