package lab9;
import java.util.Arrays;
import java.util.Random;
/*Как в примере, имеется последовательность случайных чисел, най-ти и вывести наибольшее из них.*/
/**
 * Created by USER on 04.05.2015.
 */
public class task9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int barrier = array.length - 1; barrier > 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[(i + 1)];
                    array[(i + 1)] = tmp;
                }
            }
        }
        int i = 0;
        i = array.length - 1;
        System.out.println(array[i]);
    }
}
