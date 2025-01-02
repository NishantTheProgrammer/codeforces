import java.util.Scanner;

public class Day2Team {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int sureCount = 0;
            for(int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == '1') {
                    sureCount++;
                }
            }
            if(sureCount > 1) {
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
    
}
