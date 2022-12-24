package Zoo;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        {
            animal.add("Коти");
            animal.add("Собаки");
            animal.add("Птахи");
            animal.add("Змії");
            animal.add("Риби");
            animal.add("Крокодили");
            animal.add("Їжаки");
            animal.add("Жуки");
            System.out.println(animal);
        }

    }
}