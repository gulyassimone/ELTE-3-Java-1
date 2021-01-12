package person;

import java.util.Objects;

public class Person {

    private final String name;
    private final Gender gender;
    private final int yearOfBirth;

    private Person (String name, Gender gender, int yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public static Person makePerson(String name, Gender gender, int yearOfBirth) {
        // we could use java.util.Objects.requireNonNull as well instead of if statements
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (gender == null) {
            throw new IllegalArgumentException("gender cannot be null");
        }
        return new Person(name, gender, yearOfBirth);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        Person other = (Person) obj;
        return Objects.equals(name, other.name) &&
               Objects.equals(gender, other.gender) &&
               yearOfBirth == other.yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{ name=\"" + name + "\", gender=" + gender + ", year of birth=" + yearOfBirth + " }";
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}