package Main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Teachers = new ArrayList<String>();
        Teachers.add("Вчитель хімії");
        Teachers.add("Вчитель математики");
        Teachers.add("Вчитель історії");
        Teachers.add("Вчитель англійської мови");
        Teachers.add("Вчитель фізики");
        Teachers.get(3);
        System.out.println(Teachers);
        System.out.println("Найкращий вчитель : " + Teachers.indexOf("Вчитель історії"));
        System.out.println("Найгірший вчитель : " + Teachers.indexOf("Вчитель фізики"));


    }
}
