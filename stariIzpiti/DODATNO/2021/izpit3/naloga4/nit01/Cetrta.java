
import java.util.*;

public class Cetrta {

    public static class Prostor {
        private int nadstropje;
        private int kvadratura;
        private String namembnost;

        public Prostor(int nadstropje, int kvadratura, String namembnost) {
            this.nadstropje = nadstropje;
            this.kvadratura = kvadratura;
            this.namembnost = namembnost;
        }

        @Override
        public String toString() {
            return String.format("%d. nadstropje / %s m^2 / %s",
                    this.nadstropje, this.kvadratura, this.namembnost);
        }

        // po potrebi dopolnite ...
    }

    public static Set<String> namembnosti(List<Prostor> prostori) {
        HashSet<String> VRNI = new HashSet<>();

        for(int i = 0; i < prostori.size(); i++){
            VRNI.add(prostori.get(i).namembnost);
        }

        return VRNI;
    }

    public static void uredi(List<Prostor> prostori) {
        Comparator<Prostor> komparator = new Comparator<>() {
            @Override
            public int compare(Prostor ena, Prostor dva){
                if(ena.nadstropje != dva.nadstropje){
                    return ena.nadstropje - dva.nadstropje;
                }else{
                    return dva.kvadratura - ena.kvadratura;
                }
            }
        };

        prostori.sort(komparator);
    }

    public static Map<Integer, Map<String, Integer>> statistika(List<Prostor> prostori) {
        HashMap<Integer, Map<String, Integer>> VRNI = new HashMap<>();

        for(int i = 0; i < prostori.size(); i++){
            if(!VRNI.containsKey(prostori.get(i).nadstropje)){
            HashMap<String, Integer> map = new HashMap<>();
            map.put(prostori.get(i).namembnost, map.getOrDefault(prostori.get(i).namembnost, 0) + 1);
            VRNI.put(prostori.get(i).nadstropje, map);
            }else{
                Map<String, Integer> map = VRNI.get(prostori.get(i).nadstropje);
                map.put(prostori.get(i).namembnost, map.getOrDefault(prostori.get(i).namembnost, 0) + 1);
                VRNI.put(prostori.get(i).nadstropje, map);
            }
        }

        return VRNI;
    }
}
