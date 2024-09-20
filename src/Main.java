import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final String[] NAMES = {
            "Oskar", "Ulf", "Jenny", "Erika", "Sven", "Ulvheden", "Ragnar", "Björn"
    };
    public static void main(String[] args) {
//        // arrayList för att samla alla personer (person)
//        ArrayList<Person> allPersons = generateRandomPersonsList(10);
//        // skriva ut alla personer
//        for(Person p : allPersons) {
//            System.out.println(p.getName() + " " + p.getAge() + " år gammal");
//        }
        System.out.println(' ');
        Book hej = new Book("Hejja", "Komedy",3000);
        System.out.println(hej);
    }
    public static ArrayList<Person> generateRandomPersonsList(int totalPersons) {
        ArrayList<Person> generatedPersons = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < totalPersons; i++) {
            String name =  NAMES[rand.nextInt(NAMES.length)];
//            int age = rand.nextInt(18, 68);
            int age = 70;
            generatedPersons.add(new Person(name, age));
        }
        return generatedPersons;
    }
}