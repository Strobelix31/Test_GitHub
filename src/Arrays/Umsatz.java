package Arrays;

public class Umsatz {

    public static void main(String[] args) {
        // Testdaten
        int[] dailyGains = {1000, 2000, 500, 9000, 9010};

        // Methode zum Zählen der 5%-Umsatzsprünge aufrufen
        int anzahlSprunge = count5PercentJumps(dailyGains);

        // Ergebnis ausgeben
        System.out.println("Anzahl der 5%-Umsatzsprünge: " + anzahlSprunge);
    }

    /**
     * Methode zählt die Anzahl der 5%-Umsatzsprünge in einem Array von Tagesumsätzen.
     *
     * @param gains Array mit den Tagesumsätzen
     * @return Anzahl der 5%-Umsatzsprünge
     */
    public static int count5PercentJumps(int[] gains) {
        if (gains == null) {
           System.out.println("Array darf nicht null sein!");
        }

        int anzahlSprunge = 0;
        for (int i = 1; i < gains.length; i++) { // Wenn der aktuelle Umsatz 5% über dem des Vortags liegt,wird der Zähler erhöht.
            if (gains[i] > gains[i - 1] * 1.05) {
                anzahlSprunge++;
            }
        }

        return anzahlSprunge;
    }
}
