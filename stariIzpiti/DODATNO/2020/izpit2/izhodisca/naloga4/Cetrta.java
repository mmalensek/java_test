
/*
 * Testiranje:
 *
 * tj.exe Cetrta.java . .
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> primaryVotes = new HashMap<>();
        Map<String, Integer> secondaryVotes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] votes = sc.nextLine().split(" ");
            String primary = votes[0];
            String secondary = votes[1];

            primaryVotes.put(primary, primaryVotes.getOrDefault(primary, 0) + 1);
            secondaryVotes.put(secondary, secondaryVotes.getOrDefault(secondary, 0) + 1);
        }

        // Get all unique parties
        Set<String> parties = new HashSet<>();
        parties.addAll(primaryVotes.keySet());
        parties.addAll(secondaryVotes.keySet());

        // Convert set to list
        List<String> sortedParties = new ArrayList<>(parties);

        // Sort the list by the custom comparator
        sortedParties.sort((p1, p2) -> {
            int primaryCompare = primaryVotes.getOrDefault(p2, 0) - primaryVotes.getOrDefault(p1, 0);
            if (primaryCompare != 0) {
                return primaryCompare;
            }
            int secondaryCompare = secondaryVotes.getOrDefault(p2, 0) - secondaryVotes.getOrDefault(p1, 0);
            if (secondaryCompare != 0) {
                return secondaryCompare;
            }
            return p1.compareTo(p2);
        });

        // Print the result in the required format
        System.out.println(sortedParties);
        sc.close();
    }

    // po potrebi dopolnite ...
}
