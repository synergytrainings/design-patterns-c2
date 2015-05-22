package factoryPattern;

public abstract class Movie {

	
	 public abstract String getGenre();
	    public abstract String getMainCharacter();
	    public abstract String getBudget();
	     
	    @Override
	    public String toString(){
	        return "GENRE= "+this.getGenre()+", MAINCHARACTER="+this.getMainCharacter()+", BUDGET="+this.getBudget();
	    }
	    
}
