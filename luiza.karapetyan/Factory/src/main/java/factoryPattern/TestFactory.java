package factoryPattern;

public class TestFactory {

	public static void main(String[] args) {
		Movie prestige = MovieFactory.getMovie("Prestige", "dedective",
				"Hugh Jackman", "40 Million");
		Movie intouchables = MovieFactory.getMovie("Intouchables", "comedy",
				"Fransua kluze", "10 Million");
		Movie pirate = MovieFactory.getMovie("PiratesOfTheCaribbean",
				"adventure", "Johnny Depp", "140 Million");
		System.out.println("Factory Prestige Representation::" + prestige);
		System.out.println("Factory Intouchables Representation::"
				+ intouchables);
		System.out.println("Factory Pirates Representation::" + pirate);
	}

}
