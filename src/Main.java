import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        int[] inputArray1 = {400, 450, 600, 410, 420};
        int sum = 0;
        int max = -1;
        int min = 1000;
        double average = 0;
        for (int payment : inputArray1) {
            // расчет суммы
            sum = sum + payment;
            // поиск максимальной выплаты
            if (payment > max) {
                max = payment;
            }
            //поиск минимальной выплаты
            if (payment < min) {
                min = payment;
            }
            //расчет средней выплаты
            average = sum / inputArray1.length;
        }
        System.out.println(Arrays.toString(inputArray1));
        double[] outputArray1 = {sum, max, min, average};
        System.out.println(Arrays.toString(outputArray1));

        //Задача №2
        System.out.println("Задача №2");
        int[] inputArray2 = {49000, 53000, 58000, 60000, 75000};
        float[] outputArray2 = new float[inputArray2.length];
        int element = 0;
        for (int salary : inputArray2) {
            outputArray2[element] = salary * 0.13f;
            element++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        //Задача №3
        System.out.println("Задача №3");
        int[] inputArray3 = {4000, 8900, 6556, 8452, 512};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int element1 = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[element1] = true;
            }
            element1++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //Задача №4
        System.out.println("Задача №4");
        int[] inputArray4 = {4654, 54, 5444, -122, 215};
        boolean outputArray4 = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);

        //Задача №5
        System.out.println("Задача №5");
        int[] inputArray5 = {1, 10000, -45654, 9874, 7545};
        int outputArray5 = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(outputArray5);
    }
}