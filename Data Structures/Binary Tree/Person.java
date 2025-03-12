//lets create a comparable Person

//class definition
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
    return "Person { name=" + name + ", age= " + age + "}";
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

}
