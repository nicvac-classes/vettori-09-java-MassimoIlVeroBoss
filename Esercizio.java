import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il numero di giri: ");
        n = scanner.nextInt();

        float[] hamilton = new float[n];
        float[] verstappen = new float[n];

        for (i = 0; i <= n - 1; i++) {
            System.out.print("Inserisci il tempo del " + (i + 1) + "° giro di Hamilton: ");
            hamilton[i] = scanner.nextFloat();
            System.out.print("Inserisci il tempo del " + (i + 1) + "° giro di Verstappen: ");
            verstappen[i] = scanner.nextFloat();
        }

        // Per ogni pilota sommo i tempi per calcolare il tempo di gara.
        float tempoGaraH = 0, tempoGaraV = 0;

        for (i = 0; i <= n - 1; i++) {
            tempoGaraH += hamilton[i];
            tempoGaraV += verstappen[i];
        }

        String vincitore;

        if (tempoGaraH < tempoGaraV) {
            vincitore = "Hamilton";
        } else {
            vincitore = "Verstappen";
        }

        System.out.println("Tempo Hamilton: " + tempoGaraH + ", tempo Verstappen: " + tempoGaraV);
        System.out.println("Vincitore della gara: " + vincitore);

        // Per ogni pilota cerchiamo il tempo minore.
        float tMinH = hamilton[0];
        float tMinV = verstappen[0];

        for (i = 0; i <= n - 1; i++) {
            if (hamilton[i] < tMinH) {
                tMinH = hamilton[i];
            }
            if (verstappen[i] < tMinV) {
                tMinV = verstappen[i];
            }
        }

        if (tMinH < tMinV) {
            vincitore = "Hamilton";
        } else {
            vincitore = "Verstappen";
        }

        System.out.println("Giro veloce Hamilton: " + tMinH + ", giro veloce Verstappen: " + tMinV);
        System.out.println("Il giro più veloce è di " + vincitore);

    }
}
