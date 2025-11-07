package h1;

public class H1_main {
    public static void main(String[] args) {
        System.out.println("Hallo, dies ist die main-Methode in Package h1!");

        double guthaben = -100;
        double monEingang = 200;
        int rating = -2;
        boolean warnhinweis = true;
        boolean negativ = false;

        if (guthaben < 0) { 
            negativ = true;
        } else {
            negativ = false;
        }
        if (guthaben > 0) {
        	rating += 3;
        }
        if (guthaben == 0) {
        	rating += 2;
        }
        if (guthaben < 0 &&  monEingang >= guthaben) {
        	rating += 1;
        }
        if (guthaben < 0 && monEingang < guthaben) {
        	rating -= 1;
        }
        if (guthaben < 0 && monEingang < guthaben && rating < 0) {
        	warnhinweis = true;
        }
        else {
        	warnhinweis = false;
        }
        System.out.println(warnhinweis);
        System.out.println(rating);
        System.out.println(negativ);
    }
}
