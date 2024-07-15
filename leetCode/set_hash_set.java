import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Iterator;

public class set_hash_set {
    public static void main(String[] args) {
        
        // basically množice
        HashSet<String> imena = new HashSet<>();

        imena.add("Urša");
        imena.add("Nina");
        imena.add("Eva");
        // ta vrstica ne naredi razlike, 
        // itak je order po hashu
        imena.add("Urša");

        imena.add("Manca");
        imena.remove("Manca");

        System.out.println(imena.contains("Manca"));

        System.out.println(imena);

        // iteracija čez množico
        for(String ime : imena){
            System.out.println(ime);
        }
        /*
        // iteracija z lambdo
        imena.forEach(System.out::println);
        // ali
        Iterator<String> iteratorImen = imena.iterator();
        while(iteratorImen.hasNext()){
            System.out.println(iteratorImen.next());
        }
        */

        // hitra eliminacija duplikatov
        ArrayList<Integer> stevilke = new ArrayList<>();
        stevilke.add(0);
        stevilke.add(1);
        stevilke.add(2);
        stevilke.add(1);

        HashSet<Integer> set_stevilke = new HashSet<>();
        set_stevilke.addAll(stevilke);

        System.out.println(set_stevilke);

        // ali pa direktno
        HashSet<Integer> set_stevilke2 = new HashSet<>(stevilke);
        System.out.println(set_stevilke2);

        // tree set uporabljat samo ko RES rabiš nek vrstni red
    }
}
