package Arrays;

public class Umsatz {

    public static void main(String[] args) {
        // Testdaten
        int[] dailyGains = {1000, 2000, 500, 9000, 9010};

        // Methode zum Z�hlen der 5%-Umsatzspr�nge aufrufen
        int anzahlSprunge = count5PercentJumps(dailyGains);

        // Ergebnis ausgeben
        System.out.println("Anzahl der 5%-Umsatzspr�nge: " + anzahlSprunge);
    }

    /**
     * Methode z�hlt die Anzahl der 5%-Umsatzspr�nge in einem Array von Tagesums�tzen.
     *
     * @param gains Array mit den Tagesums�tzen
     * @return Anzahl der 5%-Umsatzspr�nge
     */
    public static int count5PercentJumps(int[] gains) {
        if (gains == null) {
           System.out.println("Array darf nicht null sein!");
        }

        int anzahlSprunge = 0;
        for (int i = 1; i < gains.length; i++) { // Wenn der aktuelle Umsatz 5% �ber dem des Vortags liegt,wird der Z�hler erh�ht.
            if (gains[i] > gains[i - 1] * 1.05) {
                anzahlSprunge++;
            }
        }

        return anzahlSprunge;
    }
}
