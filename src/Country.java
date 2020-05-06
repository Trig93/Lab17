
public class Country {
	
	protected String name;
	protected int population;
	
	public Country(String name, int population) {
		this.name = name;
		this.population = population;
		
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setPop (int population) {
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPop() {
		return population;
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}

}
