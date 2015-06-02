package factoryPattern;

public class MovieFactory {
	
	public static Movie getMovie(String name, String genre, String mainCharacter, String budget){
        if("prestige".equalsIgnoreCase(name)){
        	return new Prestige(genre, mainCharacter, budget);
        }
        else if("intouchables".equalsIgnoreCase(name)){
        	return new Intouchables(genre, mainCharacter, budget);
        }
        else if("piratesOfTheCaribbean".equalsIgnoreCase(name)){
        	return new PiratesOfTheCaribbean(genre, mainCharacter, budget);
        }
         
        return null;
    }

}
