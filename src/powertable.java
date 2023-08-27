public class powertable {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");

            for (int j = 1; j <= 3; j++) {
                System.out.print((int) Math.pow(i, j) + "\t");
            }

            System.out.println();
        }
    }
}
