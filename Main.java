public class Main {
    public static void main(String[] args) {
        createTable();
    }
    public static void createTable() {
        System.out.println("---------------------------------");
        System.out.println("|  p  |  q  |  r  |  p -> (q ~ r)  |");
        System.out.println("---------------------------------");
        for (int p = 0; p < 2; p++) {
            for (int q = 0; q < 2; q++) {
                for (int r = 0; r < 2; r++) {
                    int result = (p == 0) || ((q == 0) && (r != 0)) ? 1 : 0;
                    System.out.printf("|  %d  |  %d  |  %d  |        %d        |\n", p, q, r, result);
                }
            }
        }
        System.out.println("---------------------------------");
    }
}

