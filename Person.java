class Person{
  String name;
  int age;
  String sex;
  Address address;

  Person(String name, int age, String sex, Address address) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.address = address;
  }

  public String toString(){
    return this.name + " " + this.age + " " + this.sex + " " + this.address;
  }
}

class ExamplesPerson {
 ExamplesPerson() {}; // TODO fix indentation: use 2 spaces

 Address a = new Address("Boston", "MA");
 Address b = new Address("Warwick", "RI");
 Address c = new Address("Nashua", "NH");

 Person tim = new Person("Tim", 20, "M", b);
 Person kim = new Person("Kim", 17, "F", a);
 Person dan = new Person("Dan", 22, "M", c);
 Person pat = new Person("Pat", 19, "F", a);
}
