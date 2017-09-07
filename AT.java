interface IAT {}

class Person implements IAT {
	String name;
	IAT mother;
	IAT father;
	
	Person(String name, IAT mother, IAT father) {
		this.name = name;
		this.mother = mother;
		this.father = father;
	}
}

class Unknown implements IAT {
	Unknown() {}
}

class ExamplesAT {
	ExamplesAT() {}
	
	IAT unknown = new Unknown();
	IAT terry = new Person("Terry", this.unknown, this.unknown);
	IAT elsa = new Person("Elsa", terry, this.unknown);
	IAT bienvenido = new Person("Bienvenido", this.unknown, this.unknown);
	IAT margarita = new Person("Margarita", this.unknown, this.unknown);
	IAT johnMarben = new Person("John Marben", margarita, bienvenido);
	IAT joshua = new Person("Joshua Ven", elsa, johnMarben);
	
	
	
}