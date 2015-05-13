package lab17;

/**
 * Created by USER on 13.05.2015.
 * Задание 17
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутство-вать.
 */
public class Task17 {
    public static void main(String[] args) {
        String str = " Тестовая, строка для подсчета слов и нетолько ";
        String words[];
        int sum = 0;
        str = str.trim();
        words = str.split(" +");
        sum = words.length;
        System.out.println("У нас есть " + sum + " слов");
    }
}
