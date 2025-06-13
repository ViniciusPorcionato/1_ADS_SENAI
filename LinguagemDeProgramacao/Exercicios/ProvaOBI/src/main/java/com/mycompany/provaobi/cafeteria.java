import java.util.Scanner;

public class cafeteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        scanner.close();

        int minCafe = c - b;
        int maxCafe = c - a;

        boolean possivel = false;

        for (int volumeCafe = d; volumeCafe <= c; volumeCafe += d) {

            if (volumeCafe >= minCafe && volumeCafe <= maxCafe) {
                possivel = true;
                break;
            }
        }

        if (possivel) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
