/*
            +----------------+
                        |        IMenu   |
                        +----------------+
                        |                |
                        |                |
                        +--------^-------+
                                 |
       +-------------------------+-+------------------------+
       |                           |                        |
+------+--------+         +--------+--------+     +---------+---------+
|  soup         |         |                 |     |   sandwich        |
|               |         |   salad         |     |                   |
+---------------+         +-----------------+     +-------------------+
|  String name  |         |  String name    |     |   String name     |
|  int price    |         |  int price      |     |   int price       |
|  bool isVege  |         |  bool isVege    |     |   String breadKind|
|               |         |  String dressing|     |   String filling  |
|               |         |                 |     |                   |
|               |         |                 |     |                   |
|               |         |                 |     |                   |
|               |         |                 |     |                   |
+---------------+         +-----------------+     +-------------------+

*/


interface IMenu {}

class Soup implements IMenu {
	String name; // DONE fix indentation: use 2 spaces
	int price;
	Boolean isVege;
 
 Soup(String name, int price, Boolean isVege) {
  this.name = name;
  this.price = price;
  this.isVege = isVege;
  }
}

class Salad implements IMenu {
 String name;
 int price;
 Boolean isVege;
 String dressing;

 Salad(String name, int price, Boolean isVege, String dressing) {
  this.name = name;
  this.price = price;
  this.isVege = isVege;
  this.dressing = dressing;
 }
}

class Sandwich implements IMenu {
 String name;
 int price;
 String breadKind;
 String filling;

 Sandwich(String name, int price, String breadKind, String filling) {
  this.name = name;
  this.price = price;
  this.breadKind = breadKind;
  this.filling = filling;
 }
}

class ExamplesMenu {
 ExamplesMenu() {}

 IMenu peanut = new Sandwich("Peanut Sandwich", 50, "Whole Wheat", "Peanut and Jelly");
 IMenu cheese = new Sandwich("Mean Sandwich", 100, "Burger Buns", "Ham and Cheese");
 IMenu vegesalad = new Salad("Meatless Salad", 120, true, "Olive Dressing");
 IMenu allmeat = new Salad("Ultra Meaty Salad", 500, false, "Chicken and Pork Dressing");
 IMenu macaroni = new Soup("Macaroni Soup", 100, true);
 IMenu chicken = new Soup("Chicken Soup", 200, false);
}
