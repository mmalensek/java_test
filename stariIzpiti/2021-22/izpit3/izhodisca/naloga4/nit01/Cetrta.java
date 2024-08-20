
import java.util.*;

public class Cetrta {

    public static class Avtomat {
        private String zacetnoStanje;
        private Set<String> sprejemnaStanja;
        private Map<String, Map<Character, String>> prehodi;

        public Avtomat(String zacetnoStanje, Set<String> sprejemnaStanja,
                Map<String, Map<Character, String>> prehodi) {

            this.zacetnoStanje = zacetnoStanje;
            this.sprejemnaStanja = sprejemnaStanja;
            this.prehodi = prehodi;
        }

        public String vrniZacetnoStanje() {
            return this.zacetnoStanje;
        }

        public Set<String> vrniSprejemnaStanja() {
            return this.sprejemnaStanja;
        }

        public Map<String, Map<Character, String>> vrniPrehode() {
            return this.prehodi;
        }

        public boolean jeSprejemno(String stanje) {
            return sprejemnaStanja.contains(stanje);
        }

        public String kam(String beseda) {

            String stanje = zacetnoStanje;
            
            for(int i = 0; i < beseda.length(); i++){
                stanje = prehodi.get(stanje).get(beseda.charAt(i));
                if(stanje == null){
                    return null;
                }
            }
            
            return stanje;
        }

        public static Avtomat zaBesedo(String beseda) {
            Avtomat VRNI = new Avtomat(Integer.toString(0), null, null);
            
            Set<String> sprejemnaStanja = new HashSet<>();
            sprejemnaStanja.add(Integer.toString(beseda.length() - 1));

            VRNI.sprejemnaStanja = sprejemnaStanja;

            Map<String, Map<Character, String>> prehodi = new HashMap<>();
            for(int i = 0; i < beseda.length() - 1; i++){
                Map<Character, String> temp = new HashMap<>();
                temp.put('x', Integer.toString(i + 1));
                prehodi.put(Integer.toString(i), temp);
            }


            Map<Character, String> temp = new HashMap<>();
            temp.put('x', Integer.toString(beseda.length() - 2));
            prehodi.put(Integer.toString(beseda.length() - 1), temp);

            return VRNI;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
