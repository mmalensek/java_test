import java.util.ArrayList;
import java.util.LinkedList;

public class linked_array_list {
    public static void main(String[] args) {
        
        // če hočeš linked list stringov
        LinkedList<String> L_imena = new LinkedList<>();

        L_imena.add("Bojan");
        L_imena.add("Nace");
        L_imena.add("Primož");

        L_imena.add(1, "Aljaž");

        // če pa array
        ArrayList<String> A_imena= new ArrayList<>();

        A_imena.add("Janez");

        System.out.println(L_imena);
        System.out.println(L_imena.get(0));
    }
}
