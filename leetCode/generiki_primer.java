public class generiki_primer {
    
    public static void main(String[] args) {
        
        generiki<Integer> stevilka = new generiki<>();
        stevilka.vrednost = 10;
        stevilka.natisni();

        generiki<String> beseda = new generiki<>("Eva");
        beseda.natisni();

        gogolo(10, "Beseda");
    }

    private static <T, V> void gogolo(T prva, V druga){
        System.out.println(prva + "!");
        System.out.println(druga + "?");
    }
}
