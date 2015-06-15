package lab22;

/**
 * Created by USER on 15.06.2015.
 */
public class TaskTime {
    public static void main(String[] args) {
        Task22 firstTime = new Task22(5485);
        Task22 secondTime = new Task22(3,21,60);
        System.out.println("Всего секунд secondTime - " + secondTime.totalsec()+ ".");
        System.out.println("Объекты равны? - " + firstTime.compareTo(secondTime)+ ".");
        System.out.println("Выводим данные - " + secondTime.getValue()+ ".");
        System.out.println("Колличество часов firstTime - " + firstTime.getHours()+ ", " + "колличество минут - " +
                firstTime.getMin() + ", " + "колличество секунд - " + firstTime.getSec() + "." );
    }
}

