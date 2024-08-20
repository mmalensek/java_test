
import java.util.*;

public class Tretja {

    public static class Oddajnik {
        private List<Sprejemnik> sprejemniki = new ArrayList<>();

        public void dodajSprejemnika(Sprejemnik sprejemnik){
            sprejemniki.add(sprejemnik);
        }

        public void oddaj(char crka){
            for(Sprejemnik sprejemnik : sprejemniki){
                sprejemnik.oddanaCrka(crka);
            }
        }
    }

    public static class Sprejemnik {
        private Oddajnik oddajnik;
        private List<Character> sporocila = new ArrayList<>();
        private int indeks;
        private int zacetek;

        public Sprejemnik(Oddajnik oddajnik){
            this.oddajnik = oddajnik;
            oddajnik.dodajSprejemnika(this);
            indeks = 0;
            zacetek = 0;
        }

        public void oddanaCrka(char crka){
            sporocila.add(crka);
            indeks++;
        }

        public int koliko(){
            return sporocila.size();
        }

        public String odZadnjic(){
            String VRNI = "";

            for(int i = zacetek; i < indeks; i++){
                VRNI = VRNI + Character.toString(sporocila.get(i));
            }

            zacetek = indeks;
            
            return VRNI;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
