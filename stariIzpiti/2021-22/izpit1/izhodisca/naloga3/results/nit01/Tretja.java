
/*
 * tj.exe
 */

import java.util.*;
import java.math.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            
            String[] VRNI = new String[this.najdbe.length];
            
            for(int i = 0; i < this.najdbe.length; i++){
                VRNI[i] = this.najdbe[i].vrniNajditelja();
            }

            return VRNI;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double x, y, POT = 0, prX = zacetna.vrniX(), prY = zacetna.vrniY(), zacetniX = zacetna.vrniX(), zacetniY = zacetna.vrniY();

            for(int i = 0; i < zakladi.length; i++){
                x = this.zakladi[i].vrniPolozaj().vrniX();
                y = this.zakladi[i].vrniPolozaj().vrniY();

                POT += Math.sqrt(Math.pow(x - prX, 2) + Math.pow(y - prY, 2));

                prX = x;
                prY = y;
            }

            POT += Math.sqrt(Math.pow(prX - zacetniX, 2) + Math.pow(prY - zacetniY, 2));

            return POT;
        }

        public Zaklad nazadnjeOdkrit() {
            int zadnjiCas = 0, indeks = 0;
            
            for(int i = 0; i < this.zakladi.length; i++){
                Najdba[] najdbe = this.zakladi[i].vrniNajdbe();
                if(najdbe.length > 0 && najdbe[0].vrniCas() > zadnjiCas){
                    zadnjiCas = najdbe[0].vrniCas();
                    indeks = i;
                }
            }

            if(zadnjiCas == 0){   
                return null;
            }else{
                return this.zakladi[indeks];
            }
        }
    }

    public static void main(String[] args) {
        Tretja.Geolov geolov = new Tretja.Geolov(new Tretja.Zaklad[]{
            new Tretja.Zaklad("A",
            new Tretja.Tocka(1.0, -3.0),
            new Tretja.Najdba[]{
            new Tretja.Najdba("Eva", 25),
            new Tretja.Najdba("Boris", 40),
            new Tretja.Najdba("Cvetka", 50),
            new Tretja.Najdba("Denis", 55),
            new Tretja.Najdba("Ana", 70),
            }
            ),
            
            new Tretja.Zaklad("B",
            new Tretja.Tocka(-2.0, 4.0),
            new Tretja.Najdba[]{
            new Tretja.Najdba("Gregor", 30),
            new Tretja.Najdba("Cvetka", 60),
            }
            ),
            
            new Tretja.Zaklad("C",
            new Tretja.Tocka(0.0, 2.0),
            new Tretja.Najdba[0]
            ),
            
            new Tretja.Zaklad("D",
            new Tretja.Tocka(-3.0, -6.0),
            new Tretja.Najdba[]{
            new Tretja.Najdba("Boris", 15),
            new Tretja.Najdba("Ana", 45),
            new Tretja.Najdba("Eva", 80),
            }
            )
            });
            
            double pot = geolov.pot(new Tretja.Tocka(3.0, 0.0));
            System.out.println(pot);
    }
}
