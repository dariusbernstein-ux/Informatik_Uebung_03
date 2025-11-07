package h2;

public class H2_main {public static void main(String[] args) {
    System.out.println("Hallo, dies ist die main-Methode in Package h2!");
    int jahr = 400;
    boolean schalt = false;
    if (jahr % 4 == 0) {
    	schalt = true;
    }
    if (jahr % 100 == 0) {
    	schalt = false;
    }
    if (jahr % 400 == 0 ) {
    	schalt = true;
    }
    System.out.println(schalt);


}
}