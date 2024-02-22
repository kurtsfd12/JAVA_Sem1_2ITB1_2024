import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron","Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        for(int i = 0; i < names.length; i++) {
            System.out.println("[" + names[i] +", <" + times[i] + ">]");
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
        System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
        System.out.println(positionCalc(gravity,initialVelocity,initialPosition,fallingTime));
    }

    static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {
        return (0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition);

    }
}

class factorial{
    public static void main(String[] arguments) {
        int f = 1, n = 5;
        for (int i = 1; i < n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}

class Seminar_1_Exercise3 {
    public static void main(String[] arguments) throws Exception {
        double[] test = generateArray(5,0.1,1);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        double mean = getMean(test);
        System.out.println(mean);

    }

    static double[] generateArray(int N, double lower, double upper) throws Exception {
        if(N <= 0 || (upper <lower)) throw new Exception("Wrong input parametrs");

        double[] resulte = new double[N];

        Random rand = new Random();

        for (int i = 0; i < resulte.length; i++) {
            resulte[i] = rand.nextDouble(lower,upper);
        }
        return resulte;
    }
    static double getMean(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parametrs");
        double temp = 100;
        for (int i = 0; i < array.length; i++) {
           temp =+ array[i];
        }
        temp = temp / array.length;
        return temp;
    }
    static double getMin(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parametrs");
        double temp = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = (double) array[i];
            }
        }
        return temp;
    }
    static double getMax(double[] array) throws Exception {
        if (array.length == 0) throw new Exception("Wrong input parametrs");
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = (double) array[i];
            }
        }
        return temp;
    }
    static double[] arraySort(double[] array){
        double sort = 0;
        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }
}

class Seminar_1_Exercise4 {
    public static void main(String[] arguments) throws Exception {

    }
    int[][] generateMatrix(int N) throws Exception {
        if (N <= 0) throw new Exception("Wrong input parametrs");

        int [][] matrix = new int[N][N];

        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j]=rand.nextInt();
            }
        }

        return matrix;
    }

    double getProduct(double[][] matrix, int i, int j){

        return 0;
    }
}