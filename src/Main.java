public class Main {
    public static void main(String[] args) {
        // task № 1
        int[] weight = new int[12];
        double[] second = {1.57, 7.654, 9.986};
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2]);
        for (int i = 0; i < 2; i++) {
            System.out.print(second[i] + ", ");
        }
        System.out.print(second[2]);
        {
        }
        int[] weights = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        int januaryWeigh = weights[0];
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + ", ");
        }
        System.out.println();
        {
        }
        int[] weights4 = new int[10];
        weights4[0] = 60;
        int januaryWeight = weights4[0];
        {
            System.out.print(januaryWeight + "  ");
            System.out.print(weights4[0]);
        }
        System.out.println();
        {
        }
        // task № 2
        int[] weights5 = new int[3];
        weights5[0] = 30;
        weights5[1] = 40;
        weights5[2] = 50;
        System.out.print(weights5[0] + "," + weights5[1] + "," + weights5[2]);
        {
        }
        System.out.println();
        {
        }
        int[] weights6 = new int[3];
        weights6[0] = 60;
        weights6[1] = 70;
        weights6[2] = 80;
        System.out.print(weights6[0] + "," + weights6[1] + "," + weights6[2]);
        {
        }
        System.out.println();
        {
        }
        int[] weights7 = new int[3];
        weights7[0] = 90;
        weights7[1] = 100;
        weights7[2] = 200;
        System.out.print(weights7[0] + "," + weights7[1] + "," + weights7[2]);
        {
        }
        System.out.println();
        {
        }
        // task № 3

        int[] meanFirst = new int[3];
        meanFirst[0] = 1;
        meanFirst[1] = 2;
        meanFirst[2] = 3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(meanFirst[i] + ", ");
        }
        System.out.println();
        double[] meaningSecond = {1.57, 7.654, 9.986};
        for (int i = 2; (i >= 0); i--) {
            System.out.print(meaningSecond[i] + ", ");
            {
            }
        }

        // task № 4
        int[] sweet = {1, 2, 3, 4, 5};
        for (int i = 0; i < sweet.length; i++) {
            if (sweet[i] % 2 != 0) {
                sweet[i]++;
                System.out.println();
            }
        }
        System.out.println("Результат преобразования");
        for (int i = 0; i <= sweet.length; i++) {
            System.out.print(sweet[i]);
            if (i != sweet.length - 1) {
                System.out.print(", ");
            }
        }
    }
}









