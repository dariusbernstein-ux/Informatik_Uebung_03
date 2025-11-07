package h3;

public class H3_main {

    public static void main(String[] args) {

        
        int max = 10;
        int fix = 6;
        int wartend = 5;

        
        boolean istVoll = false;

      
        while (fix < max && wartend > 0) {
            fix++;
            wartend--;
        }

        
        if (fix >= max) {
            istVoll = true;
        }

        
        System.out.println("Fixplätze vergeben: " + fix);
        System.out.println("Personen auf Warteliste: " + wartend);
        System.out.println("Veranstaltung voll: " + istVoll);
    }
}
