// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

        IPerson ruralPerson = factory.getPerson(PersonType.Rural);
        System.out.println("Rural person: " + ruralPerson.getName());

        IPerson urbanPerson = factory.getPerson(PersonType.Urban);
        System.out.println("Urban person: " + urbanPerson.getName());
    }
}
