import java.util.HashMap;

public class hash_map {
    public static void main(String[] args) {
        
        // podobno kot set (množice), samo da s pari
        HashMap<String, Integer> usluzbenci = new HashMap<>();

        usluzbenci.put("Urša", 2707);
        usluzbenci.put("Martin", 303);
        usluzbenci.put("Nina", 110);

        System.out.println(usluzbenci);
        System.out.println(usluzbenci.get("Urša"));
        // System.out.println(usluzbenci.get(2707));

    }
}
