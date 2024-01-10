import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] vect = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                vect[i][j] = in.nextInt();
            }
        }

        int x = in.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (x == vect[i][j]) {

                    System.out.println("POSITION " + i + ", " + j + " :");

                    if (i == 0) {

                        if (j == 0) {

                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("DOWN: " + vect[i + 1][j]);

                        } else if (j == (n - 1)) {

                            System.out.println("DOWN: " + vect[i + 1][j]);
                            System.out.println("LEFT: " + vect[i][j - 1]);

                        } else {
                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("DOWN: " + vect[i + 1][j]);
                            System.out.println("LEFT: " + vect[i][j - 1]);

                        }

                    } else if (i == (m - 1)) {

                        if (j == 0) {

                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        } else if (j == (n - 1)) {

                            System.out.println("LEFT: " + vect[i][j - 1]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        } else {

                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("LEFT: " + vect[i][j - 1]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        }


                    } else {

                        if (j == 0) {

                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("DOWN: " + vect[i + 1][j]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        } else if (j == (n - 1)) {

                            System.out.println("LEFT: " + vect[i][j - 1]);
                            System.out.println("DOWN: " + vect[i + 1][j]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        } else {

                            System.out.println("RIGHT: " + vect[i][j + 1]);
                            System.out.println("LEFT: " + vect[i][j - 1]);
                            System.out.println("DOWN: " + vect[i + 1][j]);
                            System.out.println("UP: " + vect[i - 1][j]);

                        }

                    }

                }
            }
        }

    }
}