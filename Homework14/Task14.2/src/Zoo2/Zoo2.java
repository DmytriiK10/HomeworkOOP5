package Zoo2;


import java.util.ArrayList;

public class Zoo2 {
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
            animal.remove("Птахи");
            animal.remove("Риби");
            animal.remove("Їжаки");
            animal.size();
            System.out.println(animal);
            System.out.println(animal.size());

        }
    }
}
