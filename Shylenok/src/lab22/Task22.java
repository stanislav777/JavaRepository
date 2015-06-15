package lab22;

import com.sun.org.apache.xpath.internal.operations.*;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by USER on 14.06.2015.
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя
 * свойствами: секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
 * получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 */

public class Task22 {
    private int hours;
    private int min;
    private int sec;

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Task22(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public Task22(int totalsec) {
        this(totalsec / 3600, totalsec / 60 % 60, totalsec % 60);
    }

    public int totalsec() {
        return hours * 3600 + min * 60 + sec;
    }

    public boolean compareTo(Task22 anotherTask22) {
        return hours == anotherTask22.hours && min == anotherTask22.min && sec == anotherTask22.sec;
    }
    public java.lang.String getValue() {
        return hours + ":" + min + ":" + sec;
    }
}

