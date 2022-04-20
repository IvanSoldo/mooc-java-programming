import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> personList;

    public Employees() {
        this.personList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.personList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.personList.add(person));
    }

    public void print() {
        this.personList.stream().forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.personList.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.personList.iterator();

        while(iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
