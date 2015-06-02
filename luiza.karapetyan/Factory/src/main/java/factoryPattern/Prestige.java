package factoryPattern;

public class Prestige extends Movie {
	
	 private String genre;
	    private String mainCharacter;
	    private String budget;
	     
	    public Prestige(String genre, String mainCharacter, String budget){
	        this.genre=genre;
	        this.mainCharacter=mainCharacter;
	        this.budget=budget;
	    }

		
		@Override
		public String getGenre() {
			return this.genre;
		}

		
		@Override
		public String getMainCharacter() {
			return this.mainCharacter;
		}
		
		@Override
		public String getBudget() {
			return this.budget;
		}
	    
}
