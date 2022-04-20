package validating;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age){
        if (!isNameValid(name) || !isAgeValid(age)) {
            throw new IllegalArgumentException("Something went wrong!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean isNameValid(String name) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            return false;
        }
        return true;
    }

    private boolean isAgeValid(int age) {
        if (age < 0 || age > 120) {
            return false;
        }
        return true;
    }

}
