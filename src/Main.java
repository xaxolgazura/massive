public class Main {
    public static void main(String[] args) {
        // task № 1 - 2
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
        // task № 3
        int[] weight1 = new int[3];
        {
            for (int i = weight1.length - 1; i >= 0; i--) {
                weight1[i] = i + 1;
                System.out.print(weight1[i] + ", ");
                if (i < weight1.length - 1) {
                    System.out.print("");
                }
            }
            System.out.println();
            double[] weight2 = {1.57, 7.654, 9.986};
            for (int i = weight2.length - 1; i >= 0; i--) {
                System.out.print(weight2[i] + ", ");
                if (i < weight2.length - 1) {
                    System.out.print("");
                }
            }
            System.out.println();
            // task № 4
            int[] ferst = new int[5];
            int even = 0;
            for (int i = 0; i < ferst.length; i++) {
                if (even % 2 == 0) {
                     i = i + 1;
                    System.out.print(i + 1);
                    System.out.print(" ");
                    {
                    }
                }
            }
        }
    }
    }





