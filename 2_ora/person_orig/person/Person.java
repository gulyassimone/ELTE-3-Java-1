package person;

public class Person{
  String firstName;
  String lastName;
  String job;
  String gender;
  int birth;

  Person(String firstName,String lastName, String job, String gender, int birth){
    this.firstName = firstName;
    this.lastName = lastName;
    this.job = job;
    this.gender = gender;
    this.birth = birth;
  }
  public static Person makePerson(String firstName,String lastName, String job, String gender, int birth){
    return new Person(firstName,lastName, job, gender, birth);
  } 

}