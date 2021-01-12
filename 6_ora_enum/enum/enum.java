public enum Gender{
  FEMALE, //singleton 
  MALE
}

public class Person{
  private final Gender gender;

}

new Person(1973,Gender.FEMALE,"Alexandra");
new Person(1973,Gender.MALE,"Bela");
new Person(1973,null,"Valami");

Gender[] values =Gender.values(); //enumb=l string
Gender.valueOf("MALE"); //visszaadja benne van e, ha nincs illegal argument exception