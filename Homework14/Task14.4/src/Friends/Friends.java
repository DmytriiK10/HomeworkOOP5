package Friends;
import java.util.ArrayList;
import java.util.Collections;
public class Friends {
    public static void main(String[] args) {
        ArrayList<String> Friends = new ArrayList<String>();
        Friends.add("Владислав");
        Friends.add("Юрій");
        Friends.add("Дмитрій");
        Friends.add("Максим");
        Friends.add("Андрій");

        Collections.sort(Friends);
        for (String counter: Friends) {
            System.out.println(counter);
        }
    }
}