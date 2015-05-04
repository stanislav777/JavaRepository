package lab6;

/**
 * Created by USER on 04.05.2015.
 */
/*   Задание 6
Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
*/
public class task6 {
    public static void main(String[] args) {
        int a = 548;
        int b = 0;
        while (a !=0){
            b = a%10 + b*10;
            a = a-a%10;
            a = a/10;
        }
        System.out.println(b);
    }


}
