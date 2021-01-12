package person;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private final String firstName;
    private final String lastName;
    private final String job;
    private final Gender gender;
    private final int yearOfBirth;

    private Person (String firstName, String lastName, String job, Gender gender, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public static Person makePerson(String firstName, String lastName, String job, Gender gender, int yearOfBirth) {
        // we could use java.util.Objects.requireNonNull as well instead of if statements
        if (firstName == null) {
            throw new IllegalArgumentException("firstName cannot be null");
        }
        if (lastName == null) {
            throw new IllegalArgumentException("lastName cannot be null");
        }
        if (gender == null) {
            throw new IllegalArgumentException("gender cannot be null");
        }
        if (job == null) {
            throw new IllegalArgumentException("job cannot be null");
        }
        return new Person(firstName, lastName, job, gender, yearOfBirth);
    }
     
    @Override
    public int compareTo(Person person) {
      return person.yearOfBirth == yearOfBirth ? 0 : 1;
    }

    @Override
    public String toString() {
        return "Person{ name=\"" + firstName + " " + lastName + "\", job=" + job + ", gender=" + gender + ", year of birth=" + yearOfBirth + " }";
    }
}