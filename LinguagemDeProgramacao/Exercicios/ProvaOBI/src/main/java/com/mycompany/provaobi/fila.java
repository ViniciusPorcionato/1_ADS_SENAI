
import java.util.Scanner;

public class fila {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int[] alturas = new int[n];
        for (int i = 0; i < n; i++) {
            alturas[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int escondidos = 0;
        
        int alturaParaBater = alturas[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (alturas[i] <= alturaParaBater) {
                escondidos++; 
            } else {
                alturaParaBater = alturas[i];
            }
        }

        System.out.println(escondidos);
    }
}
