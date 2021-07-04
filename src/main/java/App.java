import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Test :)");

        ArrayList<String> names = new ArrayList<>();

        names.add("Kamil");
        names.add("Lukasz");
        names.add("Dariusz");
        names.add("Daniel");
        names.add("Michal");
        names.add("Krzysiek");
        names.add("Maciej");

        //wszystkie imiona zaczynajace sie na "D"
        names.stream()
                .filter(name -> name.startsWith("D"))
                .forEach(name -> System.out.println(name));

        System.out.println("---");

        //wszystkie imiona zaczynajace sie na M
        names.stream()
                .filter(name -> name.startsWith("M"))
                .forEach(name -> System.out.println(name));



    }
}
