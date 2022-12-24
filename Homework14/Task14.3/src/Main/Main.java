package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        ListIterator<Integer> listIterator = numbers.listIterator();
        for (int i = 0; i <= 10; i++) {
            listIterator.add(i + 1);
                System.out.println(numbers);
            }
        }
    }








