import java.util.Scanner;

public class Day3TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        double l = Double.parseDouble(input[0]);
        double w = Double.parseDouble(input[1]);
        double s = Double.parseDouble(input[2]);
        long result = (long)(Math.ceil(l/s) * Math.ceil(w/s));
        System.out.println(result);
        sc.close();
    }
}
