import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person shortest = new Person(this.people.get(0).getName(), this.people.get(0).getHeight());

        for(Person person : people) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }

}
