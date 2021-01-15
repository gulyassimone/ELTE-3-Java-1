package main;

/* 
Lehet wildcard importot hasznalni, egy packagen belul elofordulo osszes tipusra.
Viszont csak az adott packagebol importol tipusokat, alpackagekbol rekurzivan nem!
*/
import person.*;

public class PersonTest {
	
	public static void main(String[] args) {    
		Person a = Person.makePerson("Smith", "Joe", "doctor", Gender.MALE, 1945);
		Person b = Person.makePerson("Taylor", "Ann", "hairdresser", Gender.FEMALE, 1964);
		System.out.println(a);
		System.out.println(b);
		if (a.equals(b)) {
			System.out.println("Ugyanaz a szemely");
		} else {
			System.out.println("Nem ugyanaz a szemely");
		}
	}
}