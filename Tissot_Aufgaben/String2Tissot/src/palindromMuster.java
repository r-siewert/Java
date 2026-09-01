public class palindromMuster {
    public static void main(String[] args) {
        // 1. Wort vorgeben
        String wort = "Lagerregal";
        
        // 2. In Kleinbuchstaben umwandeln
        String wortKlein = wort.toLowerCase();
        
        // 3. In einzelne Zeichen zerlegen (ein Array aus chars)
        char[] zeichen = wortKlein.toCharArray();
        
        // Variable für das Prüfergebnis
        boolean istPalindrom = true;
        
        // 4. Zeichen von links und rechts vergleichen
        // Die Schleife läuft bis zur Mitte des Wortes
        for (int i = 0; i < zeichen.length / 2; i++) {
            char links = zeichen[i];
            char rechts = zeichen[zeichen.length - 1 - i];
            
            // Wenn sich zwei gegenüberliegende Zeichen unterscheiden
            if (links != rechts) {
                istPalindrom = false;
                break; // Schleife abbrechen, da es kein Palindrom sein kann
            }
        }
        
        // 5. Ergebnis ausgeben
        if (istPalindrom) {
            System.out.println("Das Wort '" + wort + "' ist ein Palindrom.");
        } else {
            System.out.println("Das Wort '" + wort + "' ist kein Palindrom.");
        }
    }
}

