import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Yes");
        strings.add("No");
        strings.add("Maybe");
        strings.add("You can count on it!");
        strings.add("Definitely not!");
        strings.add("Unclear. Try again later.");
        strings.add("It is a magic 8-ball");

        Random random = new Random();
        String randomString = strings.get(random.nextInt(strings.size()));
        System.out.println(randomString);
    }
}
