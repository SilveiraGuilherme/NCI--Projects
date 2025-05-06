//lets create a comparable Person

//class definition

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Person implements Comparable<Person> {

  // instance variable
  private String name;
  private int age;

  // constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person: " + name + " is " + age;
  }

  // we need to implement the compare method
  @Override
  public int compareTo(Person o) {
    // this comparison should return 0, -1, or 1
    // the comparison is up to us to define based on the problem
    if (this.age == o.age) {
      return 0;
    } else if (this.age > o.age) {
      return 1;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person("Gui", 34);
    Person p2 = new Person("Jhon", 30);
    Person p3 = new Person("Maria", 25);
    Person p4 = new Person("Petter", 20);
    Person p5 = new Person("Jane", 40);
    Person p6 = new Person("Sarah", 16);

    List<Person> pList = new ArrayList<>();

    pList.add(p1);
    pList.add(p2);
    pList.add(p3);
    pList.add(p4);
    pList.add(p5);
    pList.add(p6);

    System.out.println("Before sorting");
    for (Person p : pList) {
      System.out.println(p);
    }

    Collections.sort(pList);

    System.out.println("\nAfter sorting");
    for (Person p : pList) {
      System.out.println(p);
    }
  }
}
