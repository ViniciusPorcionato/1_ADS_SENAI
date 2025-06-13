import java.util.Scanner;

public class festa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int L = sc.nextInt();

        int dist1, dist2, dist3;

        if (E > S) {
            dist1 = E - S;
        } else {
            dist1 = S - E;
        }
        if (S > L) {
            dist2 = S - L;
        } else {
            dist2 = L - S;
        }
        if (L > E) {
            dist3 = L - E;
        } else {
            dist3 = E - L;
        }
        int caminho1 = dist1 + dist2 + dist3;

        if (E > L) {
            dist1 = E - L;
        } else {
            dist1 = L - E;
        }
        if (L > S) {
            dist2 = L - S;
        } else {
            dist2 = S - L;
        }
        if (S > E) {
            dist3 = S - E;
        } else {
            dist3 = E - S;
        }
        int caminho2 = dist1 + dist2 + dist3;

        if (caminho1 < caminho2) {
            System.out.println(caminho1);
        } else {
            System.out.println(caminho2);
        }

    }
}
