package main;

import person.Gender;
import person.Person;

import java.util.*;

public class PersonTest {

    private static final Person AGENT_SMITH = Person.makePerson("Agent", "Smith", "agent", Gender.MALE, 2035);
    private static final Person TRINITY = Person.makePerson("Trinity", "Trin", "hacker", Gender.FEMALE, 2031);
    private static final Person NEO = Person.makePerson("Thomas", "Anderson", "redeemer", Gender.MALE, 2029);

    private static final Person CLONE_OF_SMITH_A = Person.makePerson("Agent", "Smith", "agent", Gender.MALE, 2035);
    private static final Person CLONE_OF_SMITH_B = Person.makePerson("Agent", "Smith", "agent", Gender.MALE, 2035);

    public static void main(String[] args) {
        testEquals();
        testSort();
        testSet();
    }

    private static void testEquals() {
        System.out.println("--- equals ---");
        System.out.println(AGENT_SMITH);
        System.out.println(CLONE_OF_SMITH_A);
        if (CLONE_OF_SMITH_A.equals(AGENT_SMITH)) {
            System.out.println("Ugyanaz a szemely");
        } else {
            System.out.println("Nem ugyanaz a szemely");
        }
    }

    private static void testSort() {
        System.out.println("--- sort ---");
        List<Person> matrixCharacters = new ArrayList<>(Arrays.asList(AGENT_SMITH, TRINITY, NEO, CLONE_OF_SMITH_A, CLONE_OF_SMITH_B));
        // Collections.sort(matrixCharacters);
        printAll(matrixCharacters);
    }

    private static void testSet() {
        System.out.println("--- set ---");
        Set<Person> matrixCharacters = new HashSet<>();
        matrixCharacters.add(AGENT_SMITH);
        printAll(matrixCharacters);
        matrixCharacters.add(AGENT_SMITH);
        printAll(matrixCharacters);
        matrixCharacters.add(CLONE_OF_SMITH_A);
        printAll(matrixCharacters);
        matrixCharacters.add(CLONE_OF_SMITH_B);
        printAll(matrixCharacters);
        matrixCharacters.add(TRINITY);
        printAll(matrixCharacters);
    }

    private static <T> void printAll(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }
}