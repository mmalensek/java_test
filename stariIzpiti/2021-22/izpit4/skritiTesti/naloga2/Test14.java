
public class Test14 {

    public static void main(String[] args) {
        int m = 23;

        int[][] p0 = {
            {4, 21, 10},
            {14, 2, 9},
            {0, 4, 4},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {2, 13, 4},
            {15, 9, 6},
            {6, 19, 2},
            {13, 6, 1},
            {10, 19, 1},
            {12, 2, 1},
            {14, 14, 1},
            {8, 8, 2},
            {0, 19, 2},
            {21, 8, 1},
            {22, 8, 1},
            {11, 20, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {9, 18, 2},
            {1, 18, 2},
            {13, 10, 6},
            {5, 7, 1},
            {8, 17, 1},
            {6, 22, 1},
            {20, 11, 1},
            {12, 20, 1},
            {7, 2, 1},
            {11, 16, 1},
            {21, 1, 2},
            {3, 10, 1},
            {19, 11, 1},
            {4, 10, 1},
            {0, 8, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {13, 18, 5},
            {20, 8, 1},
            {2, 8, 2},
            {8, 13, 5},
            {5, 2, 2},
            {18, 3, 2},
            {22, 12, 1},
            {7, 22, 1},
            {0, 13, 1},
            {4, 3, 1},
            {21, 12, 1},
            {1, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {3, 16, 13},
            {17, 9, 4},
            {16, 16, 1},
            {1, 15, 1},
            {21, 20, 2},
            {0, 5, 1},
            {2, 12, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
