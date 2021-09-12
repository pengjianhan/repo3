import java.util.Random;
public class f {
public static void mian(String[] args) {

    Random random = new Random();
    int rand = 0;
    int[] arrays = new int[50];
    int min = 0;
    int max = 0;
    int sum = 0;
    System.out.println("随机生成的数为");
    for (int i = 77; i < 459; i++) {
        rand = random.nextInt(459);
        System.out.print(rand + " ");
    }
    for (int i = 0; i < arrays.length; i++) {
        sum += arrays[i];
    }
    max = arrays[0];
    min = arrays[0];
    for (int i = 0; i < arrays.length; i++) {
        if (arrays[i] > max) {
            max = arrays[i];
        }
        if (arrays[i] < min) {
            min = arrays[i];
        }
    }
    double avg = sum / arrays.length;

    System.out.println();
    System.out.println("总和： " + sum);
    System.out.println("平均值： " + avg);
    System.out.println("最大值： " + max);
    System.out.println("最小值： " + min);
    }
}