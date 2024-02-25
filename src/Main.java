import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        for (int i = 0; i < names.length; i++) {
            System.out.println("[" + names[i] + ", <" + times[i] + ">]");
        }
    }
}

class Seminar_1_PART2 {

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("Pos in " + fallingTime + "sec :" + finalPosition);
        System.out.println(positionCalc(gravity, initialVelocity, initialPosition, fallingTime));
    }

    static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {
        return (0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition);

    }
}

class Seminar_1_Exercise2 {
    public static void main(String[] arguments) throws Exception {
        int temp = factorialForLoop(5);
        System.out.println(temp);
    }

    static int factorialForLoop(int N) throws Exception {
        if (N <= 0) throw new Exception("Wrong input parameters");
        int temp = 1;
        for (int i = 1; i < N; i++) {
            temp = temp * i;
        }
        return temp;
    }
}

class Seminar_1_Exercise3 {
    public static void main(String[] arguments) throws Exception {
        double[] test = generateArray(5, 0.1, 1);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        double mean = getMean(test);
        System.out.println(mean);

    }

    static double[] generateArray(int N, double lower, double upper) throws Exception {
        if (N <= 0 || (upper < lower)) throw new Exception("Wrong input parameters");

        double[] resulte = new double[N];

        Random rand = new Random();

        for (int i = 0; i < resulte.length; i++) {
            resulte[i] = rand.nextDouble(lower, upper);
        }
        return resulte;
    }

    static double getMean(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parameters");
        double temp = 100;
        for (int i = 0; i < array.length; i++) {
            temp = +array[i];
        }
        temp = temp / array.length;
        return temp;
    }

    static double getMin(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parameters");
        double temp = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = (double) array[i];
            }
        }
        return temp;
    }

    static double getMax(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parameters");
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = (double) array[i];
            }
        }
        return temp;
    }

    static double[] arraySort(double[] array) {
        double sort = 0;
        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }
}

class Seminar_1_Exercise4 {
    public static void main(String[] arguments) throws Exception {
        double[][] test = generateMatrix(3);

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(getProduct(test, 0, 0));
    }

    static double[][] generateMatrix(int N) throws Exception {
        if (N < 0) throw new Exception("Wrong input parameters");

        double[][] matrix = new double[N][N];

        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextDouble();
            }
        }

        return matrix;
    }

    static double getProduct(double[][] matrix, int i, int j) throws Exception {
        if (i < 0 || j < 0) throw new Exception("Wrong input parameters");

        double dotProduct = 0;

        for (int x = 0; x < matrix.length; x++) {
            dotProduct = dotProduct + (matrix[i][x] * matrix[x][j]);
        }

        return dotProduct;
    }
}

class Seminar_1_Exercise5 {
    public static void main(String[] arguments) throws Exception {
        double[] coinFlipResulte = coinFlip(100);
        System.out.println("number of heads: " + coinFlipResulte[0]);
        System.out.println("number of tails: " + coinFlipResulte[1]);
        System.out.println("ratio: heads/tails: " + coinFlipResulte[2]);

        int[] diceRollResulte = rollDice(10);
        int dice = 1;
        for (int i = 0; i < diceRollResulte.length; i++) {
            System.out.println("Dice" + dice++ + "roll : " + diceRollResulte[i]);
        }
        System.out.println(roll2Dices());
    }

    static double[] coinFlip(int N) {
        double[] resulte = new double[3];
        Random rand = new Random();
        int coin_value = 0;

        for (int i = 0; i > N; i++) {
            coin_value = rand.nextInt(2);

            if (coin_value == 0) {
                resulte[0] = resulte[0] + 1;
            } else {
                resulte[1] = resulte[1] + 1;
            }
        }
        resulte[2] = resulte[0] / resulte[1];
        return resulte;
    }

    static int[] rollDice(int N) {
        int[] resulte = new int[6];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {

            int roll = rand.nextInt(6) + 1;

            switch (roll) {
                case 1:
                    resulte[0]++;
                    break;
                case 2:
                    resulte[1]++;
                    break;
                case 3:
                    resulte[2]++;
                    break;
                case 4:
                    resulte[3]++;
                    break;
                case 5:
                    resulte[4]++;
                    break;
                case 6:
                    resulte[5]++;
                    break;
            }
        }
        return resulte;
    }

    static int roll2Dices() {
        Random rand = new Random();
        int dice = 0;
        while (rand.nextInt(6) + 1 + rand.nextInt(6) + 1 != 12) {
            dice++;
        }
        return dice;
    }
}

class Seminar_1_Exercise6 {
    public static void main(String[] arguments) throws Exception {
        byte[] array = new byte[]{72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
                32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
        System.out.println(getTextFromBytes(array));
    }

    static String getTextFromBytes(byte[] array) {
        return new String(array, StandardCharsets.UTF_8);
    }

}

class Seminar_1_Exercise7 {

    public static void main(String[] arguments) throws Exception {
        int level = 6;
        System.out.println("[" + pascalsTriangle(level) + "]");
    }

    static String pascalsTriangle(int level) throws Exception {
        if (level < 0) throw new Exception("Wrong input parameters");
        StringBuilder pascals_triangle_row = new StringBuilder();

        int dividend = factorial(level);
        int divisor = 0;
        int results = 0;

        for (int r = 0; r <= level; r++) {
            divisor = factorial(r) * factorial(level - r);
            results = dividend / divisor;
            pascals_triangle_row.append(Integer.toString(results)).append(";");
        }
        return pascals_triangle_row.toString();
    }

    static int factorial(int n) throws Exception {
        if (n < 0) throw new Exception("Wrong input parameters");
        int factorial_sum = 1;
        for (int i = n; 1 < i; i--) {
            factorial_sum = factorial_sum * i;
        }
        return factorial_sum;
    }
}